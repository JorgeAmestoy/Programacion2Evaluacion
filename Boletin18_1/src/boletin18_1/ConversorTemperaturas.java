
package boletin18_1;

public class ConversorTemperaturas {
    
    public final static float gradosC =80;
    
    public float Farenheit(float grados) throws TemperaturaErradaExcepcion{
        
        if(grados<gradosC){
            
            throw new TemperaturaErradaExcepcion("Error en F");
            
        }else{
            
            float resultado = gradosC*1.8f+32;
            System.out.println(resultado+" Farenheit");
            return resultado;
            
        }
        
        
        
        
    }
    
    public void Reamur(float grados) throws TemperaturaErradaExcepcion{
        
       if(grados<gradosC){
           
           throw new TemperaturaErradaExcepcion("Error en R");
           
       }else{
           
           float resultado = 4.0f/5.0f*gradosC;
           System.out.println(resultado+ " Reamur");
       } 
        
        
        
    }
    
    
    
    
    
}
