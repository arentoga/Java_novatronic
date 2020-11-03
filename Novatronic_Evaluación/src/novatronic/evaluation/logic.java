
package novatronic.evaluation;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Arturo Torres Garcia
 */
public class logic {
    boolean soleado;
    int temperatura;
    boolean ropaPlaya;
    
    public void solution(){
        Scanner sc = new Scanner(System.in);
        soleado = Boolean.parseBoolean(JOptionPane.showInputDialog("El día es soleado (True o False):"));
        temperatura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la temepratura"));
        ropaPlaya = Boolean.parseBoolean(JOptionPane.showInputDialog("Tenemos ropa de playa (True o False):"));      
        if(soleado == true) {
            if(temperatura<23){
            JOptionPane.showMessageDialog(null,"Dar un paseito");    
            }else{
                if(temperatura<=25){
                    JOptionPane.showMessageDialog(null, "Vamos a la playa");
                }else{
                    JOptionPane.showMessageDialog(null,"Vamos a la playa y no olvidar la sombrilla que quemamos");
                }
            }        
        }else JOptionPane.showMessageDialog(null,"No hay sol");
    
}
}
