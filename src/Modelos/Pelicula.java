/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import org.json.simple.JSONObject;

/**
 *
 * @author L E D E S M A
 */
public class Pelicula {
    private String _id;
    private String Nombre;
    private int ano;
    private String tipo;

    public Pelicula() {
    }

    public Pelicula(String Nombre, int ano, String tipo) {
        this.Nombre = Nombre;
        this.ano = ano;
        this.tipo = tipo;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
     public JSONObject toJSON() {
        JSONObject respuesta=new JSONObject();
        respuesta.put("nombre", this.getNombre());
        respuesta.put("ano", this.getAno());
        respuesta.put("tipo", this.getTipo());
        
        return respuesta;
    }

    /**
     * @return the _id
     */
    public String getId() {
        return _id;
    }

    /**
     * @param _id the _id to set
     */
    public void setId(String _id) {
        this._id = _id;
    }
    
}
