/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messager;

import javax.swing.JOptionPane;

/**
 *
 * @author mkausalik3
 */
public class GUIOutputStrategy implements Writer{

    @Override
    public void writeln(String inputString) {
        JOptionPane.showMessageDialog(null, inputString);
    }
    
}
