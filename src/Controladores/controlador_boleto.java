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
    
    public void enlaceUsuarioBoleto(String id_usuario, String id_boleto, JSONObject objetoJson){
        String endPoint = this.subUrl+"/"+id_boleto+"/usuario/"+id_usuario;
        this.miServicio.PUT(endPoint, objetoJson);
    }
    
    public void enlaceFuncionBoleto(String id_funcion, String id_boleto, JSONObject objetoJson){
        String endPoint = this.subUrl+"/"+id_boleto+"/funcion/"+id_funcion;
        this.miServicio.PUT(endPoint, objetoJson);
    }
    
    public void enlaceSillaBoleto(String id_silla, String id_boleto, JSONObject objetoJson){
        String endPoint = this.subUrl+"/"+id_boleto+"/silla/"+id_silla;
        this.miServicio.PUT(endPoint, objetoJson);
    }
    public Boleto reArmar(JSONObject objetoJson) {
        Boleto nuevoBoleto=new Boleto();
        nuevoBoleto.setId((String) objetoJson.get("_id"));
        nuevoBoleto.setTipo((String) objetoJson.get("tipo"));
        nuevoBoleto.setValor((double)objetoJson.get("valor"));
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
        funcionN.setDia((int) (long) funcion.get("dia"));
        funcionN.setMes((int) (long) funcion.get("mes"));
        return funcionN;
    }
    
    public LinkedList<Boleto> listar() {
        LinkedList<Boleto> respuesta = new LinkedList<>();
        try {
            String endPoint = this.subUrl;
            String resultado = this.miServicio.GET(endPoint);
            JSONParser parser = new JSONParser();
            JSONArray boletosJSON = (JSONArray) parser.parse(resultado);
            for (Object actual : boletosJSON) {
                JSONObject boletoJSON= (JSONObject) actual;
                Boleto nuevoBoleto=new Boleto();
                nuevoBoleto=reArmar(boletoJSON);
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
