/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller4;

import javax.swing.JOptionPane;

/**
 *
 * Realizar un algoritmo que calcule el salarioa pagarde un empleado según los siguientes parámetros: 
 * •Si gana menos de 700.000, descuento de pensión =-2%, descuento de salud =-4% y más Aux. de transporte= +11%.
 * •Si gana entre 741.000 y 999.999, descuento de pensión =-4%, descuento de salud =-6% y más Aux. de transporte= +9%.
 * •Si gana más 1.000.000y menos 1.800.00, descuento por pensión es -6%, descuento de segurode vida 5%, descuento de salud =-6% y más Aux. de transporte= +9%.
 * •Si gana más de 1.800.000 y menos de 2.500.00, descuento por pensión es -6%, descuento de seguro de vida 5%, descuento de salud =-8% y más Aux. de transporte= +8%.
 * •Si gana más de 2.500.000, descuento por pensión es -8%, descuento de seguro de vida 6%, descuento de salud =-10% y más Aux. de transporte= +9%.
 */
public class Ejercicio18 {

    /**
     * 
     * DE:
     * DS:
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double salario;
        double salariototal1;
        double salariototal2;
        double salariototal3;
        double pension;
        double salud;
        double transporte;
        
        salario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su salario: " ));
        if((salario < 700000 )){
            
         salariototal1 = salario * 0.06 - salario;  
         JOptionPane.showMessageDialog(null, "Su salario es : "+salariototal1);
         salariototal2 = salario * 0.11 + salario;  
         JOptionPane.showMessageDialog(null, "Su salario es : "+salariototal2);
         salariototal3 = salariototal1+salariototal2;  
         JOptionPane.showMessageDialog(null, "Su salario es : "+salariototal3);
            
        }
        
    }
    
}
