/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelos.Usuario;
import Servicios.Servicio;
import java.util.LinkedList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
/**
 *
 * @author jero7
 */
public class controlador_usuario {
    
    Servicio miServicio;
    String subUrl;

    public controlador_usuario(String server, String subUrl) {
        this.miServicio = new Servicio(server);
        this.subUrl = subUrl;
    }

    

    public Usuario crear(Usuario nuevoUsuario) {
        Usuario respuesta = new Usuario();
        try {
            String resultado = this.miServicio.POST(this.subUrl, nuevoUsuario.toJSON());
            respuesta = procesarJson(resultado);
        } catch (Exception e) {
            System.out.println("Error " + e);
            respuesta = null;
        }
        return respuesta;
    }

    public Usuario buscarPorCedula(String cedula) {
        Usuario respuesta = new Usuario();
        try {
            String endPoint = this.subUrl + "/cedula/" + cedula;
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

    public Usuario procesarJson(String jsonString) {
        Usuario nuevoUsuario = new Usuario();
        try {
            JSONParser parser = new JSONParser();
            JSONObject usuarioJSON = (JSONObject) parser.parse(jsonString);
            nuevoUsuario=reArmar(usuarioJSON);
        } catch (Exception e) {
            System.out.println("Error " + e);
            nuevoUsuario = null;
        }
        return nuevoUsuario;
    }

    public Usuario reArmar(JSONObject objetoJson) {
        Usuario nuevoUsuario=new Usuario();
        nuevoUsuario.setId((String) objetoJson.get("_id"));
        nuevoUsuario.setNombre((String) objetoJson.get("nombre"));
        nuevoUsuario.setCedula((String) objetoJson.get("cedula"));
        nuevoUsuario.setEmail((String) objetoJson.get("email"));
        nuevoUsuario.setAnoNacimiento((int) objetoJson.get("anoNacimiento"));
        return nuevoUsuario;
    }

    public LinkedList<Usuario> listar() {
        LinkedList<Usuario> respuesta = new LinkedList<>();
        try {
            String endPoint = this.subUrl;
            String resultado = this.miServicio.GET(endPoint);
            JSONParser parser = new JSONParser();
            JSONArray usuariosJSON = (JSONArray) parser.parse(resultado);
            for (Object actual : usuariosJSON) {
                JSONObject usuarioJSON= (JSONObject) actual;
                Usuario nuevoUsuario=new Usuario();
                nuevoUsuario=reArmar(usuarioJSON);
                respuesta.add(nuevoUsuario);
            }
        } catch (Exception e) {
            System.out.println("Error " + e);
            respuesta = null;
        }
        return respuesta;
    }
    public Usuario actualizar(Usuario actualizado){
        Usuario respuesta=new Usuario();
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
