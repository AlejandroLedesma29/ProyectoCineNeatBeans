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
public class Usuario {
    private String id;
    private String cedula;
    private String nombre;
    private String email;
    private int anoNacimiento;

    public Usuario() {
    }

    public Usuario(String id, String cedula, String nombre, String email, int anoNacimiento) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.email = email;
        this.anoNacimiento = anoNacimiento;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
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
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the anoNacimiento
     */
    public int getAnoNacimiento() {
        return anoNacimiento;
    }

    /**
     * @param anoNacimiento the anoNacimiento to set
     */
    public void setAnoNacimiento(int anoNacimiento) {
        this.anoNacimiento = anoNacimiento;
    }
    
     public JSONObject toJSON() {
        JSONObject respuesta=new JSONObject();
        respuesta.put("cedula", this.getCedula());
        respuesta.put("nombre", this.getNombre());
        respuesta.put("email", this.getEmail());
        respuesta.put("anoNacimiento", this.getAnoNacimiento());
        
        return respuesta;
    }
}
