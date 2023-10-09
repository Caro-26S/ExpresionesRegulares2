
package expresionesregulares2;

import javax.swing.JOptionPane;

public class ExpresionesRegulares2 {

    public static void main(String[] args) {
        int Opc = 0;
        
        do{
            Opc = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Registrar persona.\n"
                                                                                 + "2. Lógica.\n"
                                                                                 + "3. Salir."));
            
            switch (Opc){
                case 1:
                    IngresoDatos.Ingresar();
                    break;
                    
                case 2:
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
