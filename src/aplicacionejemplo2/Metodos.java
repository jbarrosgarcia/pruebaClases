
package aplicacionejemplo2;

import javax.swing.JOptionPane;

public class Metodos {
    public float pedirFloat(){
        return Float.parseFloat(JOptionPane.showInputDialog("Teclea Dato"));
    }
}
