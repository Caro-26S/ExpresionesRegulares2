
package expresionesregulares2;

import javax.swing.JOptionPane;

public class ExpresionesRegulares2 {

    public static void main(String[] args) {
        int Opc = 0;
        IngresoDatos a = new IngresoDatos();

        do{
            Opc = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Registrar persona.\n"
                                                                                 + "2. Lógica.\n"
                                                                                 + "3. Salir."));
            
            switch (Opc){
                case 1:
                    a.Ingresar();
                    break;
                    
                case 2:
                     String S = "";
                     S +=  "Porcentaje personas que se equivocaron confirmando el correo: "+ Operaciones.porcentaje(a.ArrayPersonas) + "\n";
                     S +=  Operaciones.documentos(a.ArrayPersonas);
                     S +=  "\nPromedio de personas con otra nacionalidad: "+ Operaciones.nacionalidad(a.ArrayPersonas);
                     JOptionPane.showMessageDialog(null, S);
                    break;
                    
                case 3:
                    break;
                    
                default: 
                    JOptionPane.showMessageDialog(null, "Opción incorrecta.");
                    break;
            }
        }while(Opc != 3);
    }
    
}
