/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Camil
 */
public class JavaApplication1 {

    static List <ProgramaAcademico> programas;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        programas= new ArrayList();
   programas.add(new ProgramaAcademico("Ingenieria de sistemas", 20));
    programas.add(new ProgramaAcademico("Psicologia", 16));
    programas.add(new ProgramaAcademico("Economia", 18));
    programas.add(new ProgramaAcademico("Comunicación Social", 18));
    programas.add(new ProgramaAcademico("Administración de Emplesas", 20));
    
    seleccionarCarrera();

    }

    private static void seleccionarCarrera() {
         List <String> texto= new ArrayList<>();
       for(int i=0; i< programas.size(); i++){
           
           texto.add((i+1)+": " +programas.get(i).nombre+ "\n");
       }
       
    int menu =Integer.parseInt(JOptionPane.showInputDialog("Seleccione carrera: \n" +texto));
    JOptionPane.showMessageDialog(null, menu);
     
    switch(menu){
        default:
             JOptionPane.showMessageDialog(null, "Seleccione valores asignados en el menu");
            break;
        case 1:
            inscribirPrograma(programas.get(0));
            break;
        case 2:
            inscribirPrograma(programas.get(1));
            break;
        case 3:
            inscribirPrograma(programas.get(2));
            break;
        case 4:
            inscribirPrograma(programas.get(3));
            break;
        case 5:
            inscribirPrograma(programas.get(4));
            break;
    }
              
    }

    private static void inscribirPrograma(ProgramaAcademico get) {
        JOptionPane.showMessageDialog(null, get.nombre);
        int index=0;
        for(int i=0; i< programas.size();i++){
            if(programas.get(i).nombre.equals(get.nombre)){
                index=i;
            }  
        }
        String nombre= JOptionPane.showInputDialog("Ingrese el nombre del estudiante");
        String cedula= JOptionPane.showInputDialog("Ingrese la cedula del estudiante");
        
        programas.get(index).setEstudiantes(new Estudiante(nombre, cedula));
        JOptionPane.showMessageDialog(null,programas.get(0).getEstudiantes());
    }
    
}
