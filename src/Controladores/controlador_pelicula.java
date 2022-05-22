/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelos.Pelicula;
import Servicios.Servicio;
import java.util.LinkedList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author L E D E S M A
 */
public class controlador_pelicula {
    Servicio miServicio;
    String subUrl;

    public controlador_pelicula(String server, String subUrl) {
        this.miServicio = new Servicio(server);
        this.subUrl = subUrl;
    }

    

    public Pelicula crear(Pelicula nuevoPelicula) {
        Pelicula respuesta = new Pelicula();
        try {
            String resultado = this.miServicio.POST(this.subUrl, nuevoPelicula.toJSON());
            respuesta = procesarJson(resultado);
        } catch (Exception e) {
            System.out.println("Error " + e);
            respuesta = null;
        }
        return respuesta;
    }

    public Pelicula buscarPorNombre(String nombre) {
        Pelicula respuesta = new Pelicula();
        try {
            String endPoint = this.subUrl + "/nombre/" + nombre;
            String resultado = this.miServicio.GET(endPoint);
            respuesta = procesarJson(resultado);
        } catch (Exception e) {
            System.out.println("Error " + e);
            respuesta = null;
        }
        return respuesta;
    }

    public void eliminar(String id) {
        String endPoint = this.subUrl + "/" + id;
        this.miServicio.DELETE(endPoint);
    }

    public Pelicula procesarJson(String jsonString) {
        Pelicula nuevoUsuario = new Pelicula();
        try {
            JSONParser parser = new JSONParser();
            JSONObject usuarioJSON = (JSONObject) parser.parse(jsonString);
            nuevoUsuario=reArmar(usuarioJSON);
        } catch (Exception e) {
            nuevoUsuario = null;
        }
        return nuevoUsuario;
    }

    public Pelicula reArmar(JSONObject objetoJson) {
        Pelicula nuevaPelicula=new Pelicula();
        nuevaPelicula.setId((String) objetoJson.get("_id"));
        nuevaPelicula.setNombre((String) objetoJson.get("nombre"));
        nuevaPelicula.setTipo((String) objetoJson.get("tipo"));
        nuevaPelicula.setAno((int) (long) objetoJson.get("ano"));
        return nuevaPelicula;
    }

    public LinkedList<Pelicula> listar() {
        LinkedList<Pelicula> respuesta = new LinkedList<>();
        try {
            String endPoint = this.subUrl;
            String resultado = this.miServicio.GET(endPoint);
            JSONParser parser = new JSONParser();
            JSONArray peliculasJSON = (JSONArray) parser.parse(resultado);
            for (Object actual : peliculasJSON) {
                JSONObject usuarioJSON= (JSONObject) actual;
                Pelicula nuevoPelicula=new Pelicula();
                nuevoPelicula=reArmar(usuarioJSON);
                respuesta.add(nuevoPelicula);
            }
        } catch (Exception e) {
            System.out.println("Error " + e);
            respuesta = null;
        }
        return respuesta;
    }
    public Pelicula actualizar(Pelicula actualizado){
        Pelicula respuesta=new Pelicula();
        try {
            String endPoint=this.subUrl+"/"+actualizado.getId();
            String resultado = this.miServicio.PUT(endPoint,actualizado.toJSON());
            respuesta = procesarJson(resultado);
        } catch (Exception e) {
            System.out.println("Error " + e);
            respuesta = null;
        }
        return respuesta;
    }
}
