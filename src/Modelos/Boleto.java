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
public class Boleto {
    private String _id;
    private double valor;
    private String tipo;
    Usuario miUsuario;
    Funcion miFuncion;
    Silla miSilla;
    
    public Boleto() {
    }

    public Boleto(double valor, String tipo) {
        this.valor = valor;
        this.tipo = tipo;
    }

    

    public Usuario getMiUsuario() {
        return miUsuario;
    }

    public Silla getMiSilla() {
        return miSilla;
    }

    public void setMiSilla(Silla miSilla) {
        this.miSilla = miSilla;
    }
    
    public void setMiUsuario(Usuario miUsuario) {
        this.miUsuario = miUsuario;
    }

    public Funcion getMiFuncion() {
        return miFuncion;
    }

    public void setMiFuncion(Funcion miFuncion) {
        this.miFuncion = miFuncion;
    }
    
    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
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
        respuesta.put("valor", this.getValor());
        respuesta.put("tipo", this.getTipo());
        respuesta.put("funcion", this.getMiFuncion());
        respuesta.put("usuario",this.getMiUsuario());
        respuesta.put("silla",this.getMiSilla());
        return respuesta;
    }

    public String getId() {
        return _id;
    }

    public void setId(String id) {
        this._id = id;
    }
}
