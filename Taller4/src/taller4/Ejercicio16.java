/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller4;

import javax.swing.JOptionPane;

/**
 *
 * Dada las horas trabajadas por un empleado determinar cuánto gana semanalmente 
 * y mensualmente, si el trabajador debe trabajar mínimo 38h semanales y un máximo de 56h.  
 * Se debe pedir la cantidad de horas trabajadas y verificar que esté dentro del rango permitido, 
 * también se debe pedir el precio de la hora.  Imprimir la cantidad de horas trabajadas y el pago.
 */
public class Ejercicio16 {

    /**
     * DE:Cantidad de horas trabajadas
     * DS: Cuanto gana semanal y mensualmente 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int canthorassemanal;
        int canthorasmensual;
        int horas;
        double gananciahora;
        double sueldo;
        
        canthorassemanal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas trabajadas: " ));
        
        
        
        
        if((canthorassemanal >=38) && (canthorassemanal<=56)){
            
         gananciahora = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el costo por su hora de trabajo: " ));   
         sueldo = gananciahora * canthorassemanal; 
         
         JOptionPane.showMessageDialog(null, "Su salario es : "+sueldo);
         canthorasmensual = canthorassemanal*4;
        JOptionPane.showMessageDialog(null, "La cantidad de horas mensuales : "+canthorasmensual);
        horas = canthorassemanal*24;
        JOptionPane.showMessageDialog(null, "La cantidad de horas mensuales fueron : "+horas);
        JOptionPane.showMessageDialog(null, "La cantidad de horas trabajas fueron: "+canthorasmensual);
        JOptionPane.showMessageDialog(null, "El sueldo es : "+sueldo);
        
        }else{
            
            JOptionPane.showMessageDialog(null, "Usted no trabajo las horas debidas para generar su sueldo");
            
        }
        
      
       
        
    }
}

            
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
            
            
        
            
        
        
        
        
        
        
        
        
        
    
    

