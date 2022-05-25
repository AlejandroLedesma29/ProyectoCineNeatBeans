/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelos.Silla;
import Servicios.Servicio;
import java.util.LinkedList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author L E D E S M A
 */
public class controlador_silla {
    Servicio miServicio;
    String subUrl;

    public controlador_silla(String server, String subUrl) {
        this.miServicio = new Servicio(server);
        this.subUrl = subUrl;
    }

    

    public Silla crear(Silla nuevaFuncion) {
        Silla respuesta = new Silla();
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

    public Silla procesarJson(String jsonString) {
        Silla nuevaSilla = new Silla();
        try {
            JSONParser parser = new JSONParser();
            JSONObject BoletoJSON = (JSONObject) parser.parse(jsonString);
            nuevaSilla=reArmar(BoletoJSON);
        } catch (Exception e) {
            nuevaSilla = null;
        }
        return nuevaSilla;
    }

    public Silla reArmar(JSONObject objetoJson) {
        Silla nuevaSilla=new Silla();
        nuevaSilla.setId((String) objetoJson.get("_id"));
        nuevaSilla.setLetra((String) objetoJson.get("letra"));
        nuevaSilla.setNumero((int) (long) objetoJson.get("numero"));

        return nuevaSilla;
    }

    public LinkedList<Silla> listar() {
        LinkedList<Silla> respuesta = new LinkedList<>();
        try {
            String endPoint = this.subUrl;
            String resultado = this.miServicio.GET(endPoint);
            JSONParser parser = new JSONParser();
            JSONArray SillaJSON = (JSONArray) parser.parse(resultado);
            for (Object actual : SillaJSON) {
                JSONObject sillaJSON = (JSONObject) actual;
                Silla nuevaSilla=new Silla();
                nuevaSilla=reArmar(sillaJSON);
                respuesta.add(nuevaSilla);
            }
        } catch (Exception e) {
            System.out.println("Error " + e);
            respuesta = null;
        }
        return respuesta;
    }
    public Silla actualizar(Silla actualizado){
        Silla respuesta=new Silla();
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
