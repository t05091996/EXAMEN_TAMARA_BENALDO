/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenpoo;

import java.io.Serializable;

/**
 *
 * @author tamara benaldo
 */
public class Modelo implements Serializable{

    private int IdMecanico;
    private String Nombre;
    private int Edad;
    private String Domicilio;
    private String Titulo;
    private String Especialidad;
    private int SueldoBase;
    private int GratTitulo;
    private int SueldoTotal;

    public Modelo() {
    }

    public Modelo(int IdMecanico, String Nombre, int Edad, String Domicilio, String Titulo, String Especialidad, int SueldoBase, int GratTitulo, int SueldoTotal) {
        this.IdMecanico = IdMecanico;
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Domicilio = Domicilio;
        this.Titulo = Titulo;
        this.Especialidad = Especialidad;
        this.SueldoBase = SueldoBase;
        this.GratTitulo = GratTitulo;
        this.SueldoTotal = SueldoTotal;
    }

    public int getIdMecanico() {
        return IdMecanico;
    }

    public void setIdMecanico(int IdMecanico) {
        this.IdMecanico = IdMecanico;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    public int getSueldoBase() {
        return SueldoBase;
    }

    public void setSueldoBase(int SueldoBase) {
        this.SueldoBase = SueldoBase;
    }

    public int getGratTitulo() {
        return GratTitulo;
    }

    public void setGratTitulo(int GratTitulo) {
        this.GratTitulo = GratTitulo;
    }

    public int getSueldoTotal() {
        return SueldoTotal;
    }

    public void setSueldoTotal(int SueldoTotal) {
        this.SueldoTotal = SueldoTotal;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre Mecanico: ").append(Nombre);
        sb.append("\nEdad: ").append(Edad);
        sb.append("\nEspecialidad: ").append(Especialidad);
        sb.append("\nTitulo: ").append(Titulo);
        return sb.toString();
    }

}
