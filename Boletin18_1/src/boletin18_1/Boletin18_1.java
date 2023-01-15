
package boletin18_1;

import javax.swing.JOptionPane;


public class Boletin18_1 {

    public static void main(String[] args) {
    
       ConversorTemperaturas con = new ConversorTemperaturas();
         float gradoss = Float.parseFloat(JOptionPane.showInputDialog("Escribe grados"));
        System.out.println(gradoss+" centigrados son igual a: ");
        try{
            con.Farenheit(gradoss);
            con.Reamur(gradoss);
            
            
        }catch(TemperaturaErradaExcepcion ex){
            
            System.out.println(ex.toString());
        }
        System.out.println("Fin del programa");
        
        
        
        
        
        
        
    }
    
}
