/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller4;

import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

/**
 *
 *Realizar un programa que calcule el valor a pagar por algunos galones de 
 * gasolina si sabemos que cada litro de gasolina vale 9.500.
 *Imprimir la cantidad de galones, precio por galón, 
 * cantidad de litros y precio a pagar.
 */
public class Taller4 {

    /**
     * DE:Valor a pagar por cantidad de galones de gasolina
     * DS:Precio total de los galones adquiridos
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
      double Cantgalones = 3.78;
      double preciogalon = 35.910;
      double valorpagar = 0;
      double canTlitros = 0;
      
      
      Cantgalones = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de galones: " ));
      valorpagar = Cantgalones*preciogalon;
      canTlitros = Cantgalones * 3.78;
      JOptionPane.showMessageDialog(null, "La cantidad de galones es : "+Cantgalones);
      JOptionPane.showMessageDialog(null, "El precio por galon es: "+preciogalon);
      JOptionPane.showMessageDialog(null, "La cantidad de litros es: "+canTlitros);
      
      JOptionPane.showMessageDialog(null, "El valor de la compra es: "+valorpagar);
       
       
     
      
      
      
      
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
