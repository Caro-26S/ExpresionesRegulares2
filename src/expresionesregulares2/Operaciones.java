
package expresionesregulares2;

import java.util.ArrayList;

public class Operaciones {
    public static String porcentaje(ArrayList<Persona> P){
        float pct;
        float cant = 0;
        for (Persona persona : P) {
            if (persona.isCant()) {
               cant++; 
            }
        }
        
        pct = ((cant/P.size()))*100 ;
        return "" + pct;
    }
    
    public static String documentos(ArrayList<Persona> P){
        int cantCE = 0, cantP = 0;
        for (Persona persona : P) {
            if (persona.getTipo().equalsIgnoreCase("Cédula de Extranjeria")) {
                cantCE++;
            }else if(persona.getTipo().equalsIgnoreCase("Pasaporte")){
                cantP++;
            }
        }
        return "Cantidad de personas con Cedula de Extranjeria: " + cantCE + "\nCantidad de personas con Pasaporte: " + cantP;
    }
    
    public static String nacionalidad(ArrayList<Persona> P){
        float prom;
        float cant = 0;
        for (Persona persona : P) {
            if (persona.getNacionalidad().equalsIgnoreCase("Otro")) {
               cant++; 
            }
        }
        
        prom = ((cant/P.size())) ;
        return "" + prom;
    
    }
}
