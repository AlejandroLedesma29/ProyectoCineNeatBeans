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
public class Funcion {
    private int hora;
    private int dia;
    private int mes;
    private int ano;

    public Funcion() {
    }

    public Funcion(int hora, int dia, int mes, int ano) {
        this.hora = hora;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    /**
     * @return the hora
     */
    public int getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(int hora) {
        this.hora = hora;
    }

    /**
     * @return the dia
     */
    public int getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     * @return the mes
     */
    public int getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(int mes) {
        this.mes = mes;
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
    
    public JSONObject toJSON() {
        JSONObject respuesta=new JSONObject();
        respuesta.put("hora", this.getHora());
        respuesta.put("dia", this.getDia());
        respuesta.put("mes", this.getMes());
        respuesta.put("ano", this.getAno());

        return respuesta;
    }
}
