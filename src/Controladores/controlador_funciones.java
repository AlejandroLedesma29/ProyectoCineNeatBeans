/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelos.Funcion;
import Modelos.Pelicula;
import Modelos.Sala;
import Servicios.Servicio;
import java.util.LinkedList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author L E D E S M A
 */
public class controlador_funciones {
     Servicio miServicio;
    String subUrl;

    public controlador_funciones(String server, String subUrl) {
        this.miServicio = new Servicio(server);
        this.subUrl = subUrl;
    }

    

    public Funcion crear(Funcion nuevaFuncion) {
        Funcion respuesta = new Funcion();
        try {
            String resultado = this.miServicio.POST(this.subUrl,nuevaFuncion.toJSON());
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

    public Funcion procesarJson(String jsonString) {
        Funcion nuevaFuncion = new Funcion();
        try {
            JSONParser parser = new JSONParser();
            JSONObject BoletoJSON = (JSONObject) parser.parse(jsonString);
            nuevaFuncion=reArmar(BoletoJSON);
        } catch (Exception e) {
            nuevaFuncion = null;
        }
        return nuevaFuncion;
    }

    public Funcion reArmar(JSONObject objetoJson) {
        Funcion nuevaFuncion=new Funcion();
        nuevaFuncion.setId((String) objetoJson.get("_id"));
        nuevaFuncion.setAno((int) (long) objetoJson.get("ano"));
        nuevaFuncion.setDia((int) (long) objetoJson.get("dia"));
        nuevaFuncion.setHora((int) (long) objetoJson.get("hora"));
        nuevaFuncion.setMes((int) (long) objetoJson.get("mes"));  
        JSONObject peli = (JSONObject) objetoJson.get("pelicula");
        Pelicula pelicula = new Pelicula();
        pelicula.setAno((int) (long) peli.get("ano"));
        pelicula.setId((String)peli.get("_id"));
        pelicula.setNombre((String)peli.get("nombre"));
        pelicula.setTipo((String)peli.get("tipo"));
        nuevaFuncion.setMiPelicula(pelicula);
        JSONObject sala = (JSONObject) objetoJson.get("sala");
        Sala nuevaSala = new Sala();
        nuevaSala.setEfectosEspeciales((boolean) sala.get("efectosEspeciales"));
        nuevaSala.setId((String)sala.get("_id"));
        nuevaSala.setNombre((String)sala.get("nombre"));
        nuevaFuncion.setMiSala(nuevaSala);
        return nuevaFuncion;
    }

    public LinkedList<Funcion> listar() {
        LinkedList<Funcion> respuesta = new LinkedList<>();
        try {
            String endPoint = this.subUrl;
            String resultado = this.miServicio.GET(endPoint);
            JSONParser parser = new JSONParser();
            JSONArray BoletoJSON = (JSONArray) parser.parse(resultado);
            for (Object actual : BoletoJSON) {
                JSONObject usuarioJSON= (JSONObject) actual;
                Funcion nuevaFuncion=new Funcion();
                nuevaFuncion=reArmar(usuarioJSON);
                respuesta.add(nuevaFuncion);
            }
        } catch (Exception e) {
            System.out.println("Error " + e);
            respuesta = null;
        }
        return respuesta;
    }
    public Funcion actualizar(Funcion actualizado){
        Funcion respuesta=new Funcion();
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
