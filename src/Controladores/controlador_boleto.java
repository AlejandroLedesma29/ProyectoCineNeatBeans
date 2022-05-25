/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelos.Boleto;
import Modelos.Funcion;
import Modelos.Silla;
import Modelos.Usuario;
import Servicios.Servicio;
import java.util.LinkedList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author L E D E S M A
 */
public class controlador_boleto {
    Servicio miServicio;
    String subUrl;

    public controlador_boleto(String server, String subUrl) {
        this.miServicio = new Servicio(server);
        this.subUrl = subUrl;
    }

    

    public Boleto crear(Boleto nuevoBoleto) {
        Boleto respuesta = new Boleto();
        try {
            String resultado = this.miServicio.POST(this.subUrl,nuevoBoleto.toJSON());
            respuesta = procesarJson(resultado);
        } catch (Exception e) {
            System.out.println("Error " + e);
            respuesta = null;
        }
        return respuesta;
    }
    /*
    public Boleto buscarPorNombre(String nombre) {
        Boleto respuesta = new Boleto();
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
*/

    public void eliminar(String id) {
        String endPoint = this.subUrl + "/" + id;
        this.miServicio.DELETE(endPoint);
    }

    public Boleto procesarJson(String jsonString) {
        Boleto nuevoBoleto = new Boleto();
        try {
            JSONParser parser = new JSONParser();
            JSONObject BoletoJSON = (JSONObject) parser.parse(jsonString);
            nuevoBoleto=reArmar(BoletoJSON);
        } catch (Exception e) {
            nuevoBoleto = null;
        }
        return nuevoBoleto;
    }

    public Boleto reArmar(JSONObject objetoJson) {
        Boleto nuevoBoleto=new Boleto();
        nuevoBoleto.setId((String) objetoJson.get("_id"));
        nuevoBoleto.setTipo((String) objetoJson.get("tipo"));
        nuevoBoleto.setValor(Double.parseDouble((objetoJson.get("valor"))));
        
        JSONObject funcion = (JSONObject) objetoJson.get("funcion");      
        nuevoBoleto.setMiFuncion(setearFuncion(funcion));
        
        JSONObject usuario = (JSONObject) objetoJson.get("usuario");
        nuevoBoleto.setMiUsuario(setearUsuario(usuario));
        
        
        JSONObject silla = (JSONObject) objetoJson.get("funcion");
        nuevoBoleto.setMiSilla(setearSilla(silla));
        
        return nuevoBoleto;
    }
    public Silla setearSilla(JSONObject silla){
        Silla sillaN = new Silla();
        sillaN.setNumero((int) (long) silla.get("numero"));
        sillaN.setId((String)silla.get("_id"));
        sillaN.setLetra((String)silla.get("letra"));
        return sillaN;
    }
    
    public Usuario setearUsuario(JSONObject usuario){
        Usuario usuarioN = new Usuario();
        usuarioN.setAnoNacimiento((int) (long) usuario.get("anoNacimiento"));
        usuarioN.setId((String)usuario.get("_id"));
        usuarioN.setCedula((String) usuario.get("cedula"));
        usuarioN.setEmail((String) usuario.get("email"));
        usuarioN.setNombre((String) usuario.get("nombre"));
        return usuarioN;
    }
    
    public Funcion setearFuncion(JSONObject funcion){
        Funcion funcionN = new Funcion();
        funcionN.setAno((int) (long) funcion.get("ano"));
        funcionN.setId((String)funcion.get("_id"));
        funcionN.setHora((int) (long) funcion.get("nombre"));
        funcionN.setDia((int) (long) funcion.get("tipo"));
        funcionN.setMes((int) (long) funcion.get("tipo"));
        return funcionN;
    }
    
    public LinkedList<Boleto> listar() {
        LinkedList<Boleto> respuesta = new LinkedList<>();
        try {
            String endPoint = this.subUrl;
            String resultado = this.miServicio.GET(endPoint);
            JSONParser parser = new JSONParser();
            JSONArray BoletoJSON = (JSONArray) parser.parse(resultado);
            for (Object actual : BoletoJSON) {
                JSONObject usuarioJSON= (JSONObject) actual;
                Boleto nuevoBoleto=new Boleto();
                nuevoBoleto=reArmar(usuarioJSON);
                respuesta.add(nuevoBoleto);
            }
        } catch (Exception e) {
            System.out.println("Error " + e);
            respuesta = null;
        }
        return respuesta;
    }
    public Boleto actualizar(Boleto actualizado){
        Boleto respuesta=new Boleto();
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
