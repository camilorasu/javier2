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
double precioNeto;
 double precioFinal;
 ArrayList <Estudiante> estudiantes; 
 FormaPago forma;
 double descuento;
 double porcentaje;

    public ProgramaAcademico(String nombre, int creditos, double porcentaje) {
        this.nombre = nombre;
        this.creditos = creditos;
        this.porcentaje= porcentaje;
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

    public double getPrecioneto() {
        return precioNeto;
    }

    public void setPrecioneto() {
        this.precioNeto = this.creditos*200000;
        
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Estudiante estudiante) {
        this.estudiantes.add(estudiante); 
    }
    
    public void setdescuento(String forma){
        if(forma.equals("efectivo")){
       this.forma=new FormaPago(forma,porcentaje);}
        if(forma.equals("tarjeta")){
       this.forma=new FormaPago(forma,0);
        }
       this.forma.setDescuento(precioNeto);
       this.descuento= this.forma.getDescuento();
    }
    
    public double getDescuento(){
        return descuento;
    }
    
    public void setPrecioFinal(){
        this.precioFinal= precioNeto-descuento;
    }

    public double getPrecioFinal(){
        return precioFinal;
    }

    @Override
    public String toString() {
        return "ProgramaAcademico{" + "nombre=" + nombre + ", creditos=" + creditos + ", precioNeto=" + precioNeto + ", precioFinal=" + precioFinal + ", estudiantes=" + estudiantes + ", descuento=" + descuento + ", porcentaje=" + porcentaje + '}';
    }
    
    
    
}
