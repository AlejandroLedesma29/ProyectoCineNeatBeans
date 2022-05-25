/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.util.LinkedList;
import org.json.simple.JSONObject;

/**
 *
 * @author L E D E S M A
 */
public class Sala {
    private String nombre;
    private boolean EfectosEspeciales;
    private LinkedList<Silla> misSillas;

    public Sala() {
    }

    public Sala(String nombre, boolean EfectosEspeciales) {
        this.nombre = nombre;
        this.EfectosEspeciales = EfectosEspeciales;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the EfectosEspeciales
     */
    public boolean isEfectosEspeciales() {
        return EfectosEspeciales;
    }

    /**
     * @param EfectosEspeciales the EfectosEspeciales to set
     */
    public void setEfectosEspeciales(boolean EfectosEspeciales) {
        this.EfectosEspeciales = EfectosEspeciales;
    }
    
     public JSONObject toJSON() {
        JSONObject respuesta=new JSONObject();
        respuesta.put("nombre", this.getNombre());
        respuesta.put("efectosEspeciales", this.isEfectosEspeciales());
        
        return respuesta;
    }

    /**
     * @return the misSillas
     */
    public LinkedList<Silla> getMisSillas() {
        return misSillas;
    }

    /**
     * @param misSillas the misSillas to set
     */
    public void setMisSillas(LinkedList<Silla> misSillas) {
        this.misSillas = misSillas;
    }
}
