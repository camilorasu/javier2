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
     
    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        programas= new ArrayList();
    programas.add(new ProgramaAcademico("Ingenieria de sistemas", 20, 0.18));
    programas.add(new ProgramaAcademico("Psicologia", 16, 0.12));
    programas.add(new ProgramaAcademico("Economia", 18, 0.10));
    programas.add(new ProgramaAcademico("Comunicación Social", 18, 0.05));
    programas.add(new ProgramaAcademico("Administración de Emplesas", 20, 0.15));
    
     boolean salir=false;
     while(!salir){
         
         int menu= Integer.parseInt(JOptionPane.showInputDialog("*******Menu******** \n" + "1. Inscribir estudiante \n" + "2. Mostrar Estudiantes inscriptos en programa \n" + "0.Salir \n"));
         switch(menu){
             case 1: 
                 seleccionarCarrera();
                 break;
             case 2:
                 verEstudiantes();
                 break;
             case 0:
                 salir=true;
                 JOptionPane.showMessageDialog(null, "Adiós");
                 break;
            default:
                JOptionPane.showMessageDialog(null, "Seleccione alguna opcion correcta");
         }
     }
    }

    private static void seleccionarCarrera() {
      
   
    boolean salir=false;
    
     while(!salir){
         int menu =Integer.parseInt(JOptionPane.showInputDialog("Seleccione carrera: \n "

            + "1." +programas.get(0).nombre+"\n 2."+programas.get(1).nombre+"\n 3." +programas.get(2).nombre+ "\n 4." +programas.get(3).nombre+ "\n 5." +programas.get(4).nombre+ "\n 0.Salir"));
    switch(menu){
        default:
             JOptionPane.showMessageDialog(null, "Seleccione valores asignados en el menu");
            break;
        case 0:
            salir=true;
            break;
        case 1:
            inscribirPrograma(0);
            break;
        case 2:
            inscribirPrograma(1);
            break;
        case 3:
            inscribirPrograma(2);
            break;
        case 4:
            inscribirPrograma(3);
            break;
        case 5:
            inscribirPrograma(4);
            break;
    }

     }       
    }
              

    private static void inscribirPrograma(int n) {
         String nombre;
         String cedula;
         programas.get(n).setPrecioneto();
         nombre= JOptionPane.showInputDialog("Ingrese el nombre del estudiante");
         cedula= JOptionPane.showInputDialog("Ingrese la cedula del estudiante");
         programas.get(n).setEstudiantes(new Estudiante(nombre, cedula));
         int forma=Integer.parseInt(JOptionPane.showInputDialog("Seleccione forma de pago \n 1.efectivo \n 2.tarjeta"));
         switch(forma){
             case 1:
                 programas.get(n).setdescuento("efectivo");
                 programas.get(n).setPrecioFinal();
                 JOptionPane.showMessageDialog(null,"Precio final igual a: " +programas.get(n).getPrecioFinal()+ "\n descuento: " +programas.get(n).getDescuento());
                 break;
             case 2:
                 programas.get(n).setdescuento("tarjeta");
                 programas.get(n).setPrecioFinal();
                 JOptionPane.showMessageDialog(null,"Precio final igual a: " +programas.get(n).getPrecioFinal()+ "\n descuento: " +programas.get(n).getDescuento());
                 break;
             default:
                 JOptionPane.showMessageDialog(null, "Seleccione alguna opcion");
                 break;
                 
         }
        
    }

    private static void verEstudiantes() {
          int menu= Integer.parseInt(JOptionPane.showInputDialog("Seleccione carrera: \n 1." +programas.get(0).nombre+"\n 2."+programas.get(1).nombre+"\n 3." +programas.get(2).nombre+ "\n 4." +programas.get(3).nombre+ "\n 5." +programas.get(4).nombre));
          
          switch(menu){
            case 1: 
                JOptionPane.showMessageDialog(null, "La cantidad de estudiantes inscriptos en " + programas.get(0).nombre + " Es igual: " +programas.get(0).getEstudiantes().size());
                        break;
                     case 2: 
                        JOptionPane.showMessageDialog(null, "La cantidad de estudiantes inscriptos en " + programas.get(1).nombre + " Es igual: " +programas.get(1).getEstudiantes().size());
                        break;
                         case 3: 
                        JOptionPane.showMessageDialog(null, "La cantidad de estudiantes inscriptos en " + programas.get(2).nombre + " Es igual: " +programas.get(2).getEstudiantes().size());
                        break;
                         case 4: 
                        JOptionPane.showMessageDialog(null, "La cantidad de estudiantes inscriptos en " + programas.get(3).nombre + " Es igual: " +programas.get(3).getEstudiantes().size());
                        break;
                         case 5: 
                        JOptionPane.showMessageDialog(null, "La cantidad de estudiantes inscriptos en " + programas.get(4).nombre + " Es igual: " +programas.get(4).getEstudiantes().size());
                        break;
                      default:
                           JOptionPane.showMessageDialog(null, "Seleccione alguna opcion correcta");
                           break;
                }
    }
    
}
