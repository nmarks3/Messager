/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messager;

/**
 *
 * @author mkausalik3
 */
public class Startup {
    public static void main(String[] args) {
        //arguments sent with constructor
        MessagerService mser = new MessagerService(new GUIInputStrategy(), new ConsoleOutputStrategy());
        
        //methods for changing the input/output manually
        //mser.setReader(new GUIInputStrategy());
        //mser.setWriter(new GUIOutputStrategy());
        
        mser.message();
        
    }
    
    
}
