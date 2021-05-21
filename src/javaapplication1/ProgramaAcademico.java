/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;

/**
 *
 * @author Camil
 */
public class ProgramaAcademico {
    
 String nombre;
 int creditos;
 double descuento;
 double precio;
 ArrayList <Estudiante> estudiantes; 
 FormaPago forma;

    public ProgramaAcademico(String nombre, int creditos) {
        this.nombre = nombre;
        this.creditos = creditos;
        estudiantes= new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = this.precio*descuento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = this.creditos*200000;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Estudiante estudiante) {
        this.estudiantes.add(estudiante); 
    }

    @Override
    public String toString() {
        return "ProgramaAcademico{" + "nombre=" + nombre + ", creditos=" + creditos + ", descuento=" + descuento + ", precio=" + precio + ", estudiantes=" + estudiantes + '}';
    }
}
