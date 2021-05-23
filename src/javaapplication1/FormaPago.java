/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Camil
 */
public class FormaPago {
    
   String forma;
   double descuento;
   double porcentaje;

    public FormaPago(String forma, double porcentaje) {
        this.forma = forma;
        this.porcentaje=porcentaje;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double precio) {
        this.descuento = precio* porcentaje;
    }

    @Override
    public String toString() {
        return "FormaPago{" + "forma=" + forma + ", descuento=" + descuento + '}';
    }
   

   
    
}
