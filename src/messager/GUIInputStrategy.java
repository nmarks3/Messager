
package messager;

import javax.swing.JOptionPane;

/**
 *
 * @author mkausalik3
 */
public class GUIInputStrategy implements Reader{

    @Override
    public String readln() {
       return JOptionPane.showInputDialog(null);
    }
    
}
