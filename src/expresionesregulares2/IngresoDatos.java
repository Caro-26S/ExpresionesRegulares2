
package expresionesregulares2;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class IngresoDatos {

    public IngresoDatos() {
    }
    
    
    
    public ArrayList<Persona> ArrayPersonas= new ArrayList<>();
    
    public void Ingresar(){
        Persona Registro = new Persona();
        
        String Nombre = Nombre();
        Registro.setNombre(Nombre);
        
        String Apellido = Apellido();
        Registro.setApellido(Apellido);
        
        String Tipo = TipoDocumento();
        Registro.setTipo(Tipo);
        
        String Documento = Documento();
        Registro.setDocumento(Documento);
        
        String Lugar = LugarVive();
        Registro.setLugar(Lugar);
        
        String Nacionalidad = Nacionalidad();
        Registro.setNacionalidad(Nacionalidad);

        Registro = Correo(Registro);

        String Contraseña = Contraseña();
        Registro.setContraseña(Contraseña);
        
        ArrayPersonas.add(Registro);
    }
    
    public static String Nombre(){
        String Nombre = "";
        Pattern Validar = Pattern.compile("([^0-9]*[a-zA-Z]){2}[a-zA-Z]*");
        boolean Cumple = false;
        
        while (!Cumple){
            Nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre(Por lo menos 2 digitos):");
            
            Matcher ComparacionNombre = Validar.matcher(Nombre);
            if (ComparacionNombre.matches()){
                Cumple = true;
            }else{
                JOptionPane.showMessageDialog(null, "El nombre no puede contener números ni caracteres especiales.");
            }
        } 
        return Nombre;
    }
    
    static String Apellido(){
        String Apellido = "";
        Pattern Validar = Pattern.compile("([^0-9]*[a-zA-Z]){2}[a-zA-Z]*");
        boolean Cumple = false;
        
        while (!Cumple){
            Apellido = JOptionPane.showInputDialog(null, "Ingrese el apellido(Por lo menos 2 digitos):");
            
            Matcher ComparacionNombre = Validar.matcher(Apellido);
            if (ComparacionNombre.matches()){
                Cumple = true;
            }else{
                JOptionPane.showMessageDialog(null, "El apellido no puede contener números ni caracteres especiales.");
            }
        }
        return Apellido;
    }
    
    static String TipoDocumento(){
        Object S = "";
        String Vector[] = {"Cédula de Ciudadania","Cédula de Extranjeria","Pasaporte"};
        
        S = JOptionPane.showInputDialog(null,"Seleccione tipo de documento", "ELEGIR", JOptionPane.QUESTION_MESSAGE,null,Vector, Vector[0]);
        String Tipo = S.toString();
        return Tipo;
    }
    
    static String Documento(){
        String Documento = "";
        Pattern ValidarDoc = Pattern.compile("\\d{6,10}");
        boolean Cumple = false;
        
        while(!Cumple){
            Documento = JOptionPane.showInputDialog(null, "Ingrese el número de documento:");
            
            Matcher ComparacionDoc = ValidarDoc.matcher(Documento);
            if (ComparacionDoc.matches()){
                Cumple = true;
            }else{
                JOptionPane.showMessageDialog(null, "El documento debe contener entre 6 y 10 dígitos.");
            }
        }
        return Documento;
    }
    
    static String LugarVive(){
        Object S = "";
        
        String Vector[] = {"Medellín","Bogotá","Envigado","Caldas","Bello","Industriales","Poblado","Girardota","Cartagena","Otro"};
        
        S = JOptionPane.showInputDialog(null,"Seleccione el lugar donde vive", "ELEGIR",JOptionPane.QUESTION_MESSAGE,null,Vector, Vector[0]);
        String Lugar = S.toString();
        
        return Lugar;
    }
    
    static String Celular(){
        String Celular = "";
        
        return Celular;
    }
    
    static String Nacionalidad(){
        Object S = "";
        
        String Vector[] = {"Colombiano(a)","Otro"};
        
        S = JOptionPane.showInputDialog(null,"Seleccione la nacionalidad", "ELEGIR",JOptionPane.QUESTION_MESSAGE,null,Vector, null);
        String Nacionalidad = S.toString();
        
        return Nacionalidad;
    }
    
    static Persona Correo(Persona P){
        String Correo = "";
        Pattern ValidarCorreo = Pattern.compile("[a-zA-Z0-9._]+@[a-zA-Z]+\\.[a-zA-Z]{2,5}");
        boolean Cumple = false;
        
        while (!Cumple){
            Correo = JOptionPane.showInputDialog(null, "Ingrese el correo electrónico:");
            
            Matcher CompararCorreo = ValidarCorreo.matcher(Correo);
            if (CompararCorreo.matches()){
                
                while (!Cumple){
                    String ConfirmarCorreo = JOptionPane.showInputDialog(null, "Confirmar correo:");

                    if(!Correo.equals(ConfirmarCorreo)){
                        JOptionPane.showMessageDialog(null, "El correo no coincide.");
                        P.setCant(true);
                    }else{
                        Cumple = true;
                        P.setCorreo(Correo);
                    }
                }
            }else{
                JOptionPane.showMessageDialog(null, "Correo mal ingresado.");
            }
        }
        
        return P;
    }
    
    static String Contraseña(){
        String Contraseña = "";
        Pattern ValidarCon = Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}");
        boolean Cumple = false;
        
        while (!Cumple){
            Contraseña = JOptionPane.showInputDialog(null, "Ingrese la contraseña:");
            
            Matcher CompararCon = ValidarCon.matcher(Contraseña);
            if (CompararCon.matches()){
                
                while (!Cumple){
                    String ConfirmarCon = JOptionPane.showInputDialog(null, "Confirme la contraseña:");
                    
                    if (!Contraseña.equals(ConfirmarCon)){
                        JOptionPane.showMessageDialog(null, "La contraseña no coincide.");
                    }else{
                        Cumple = true;
                    }
                }
            }else{
                JOptionPane.showMessageDialog(null, "Contraseña no válida.");
            }
        }
        
        return Contraseña;
    }
}
