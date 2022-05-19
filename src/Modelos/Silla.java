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
public class Silla {
    private String letra;
    private int numero;

    public Silla() {
    }

    public Silla(String letra, int numero) {
        this.letra = letra;
        this.numero = numero;
    }

    /**
     * @return the letra
     */
    public String getLetra() {
        return letra;
    }

    /**
     * @param letra the letra to set
     */
    public void setLetra(String letra) {
        this.letra = letra;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
     public JSONObject toJSON() {
        JSONObject respuesta=new JSONObject();
        respuesta.put("letra", this.getLetra());
        respuesta.put("numero", this.getNumero());
       
        return respuesta;
    }
}
