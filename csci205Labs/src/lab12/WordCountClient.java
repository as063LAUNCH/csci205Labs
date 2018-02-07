/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12;

import java.io.File;
import javax.swing.JFileChooser;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author as063
 */
public class WordCountClient {
    
    public static void main(String args[]) {
        //Create a file chooser
        JFileChooser fc = new JFileChooser();
        int result = fc.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fc.getSelectedFile();
            System.out.println("Selected file: " + selectedFile.getAbsolutePath());
            WordCount instance = new WordCount(selectedFile);
            instance.doIt();
        }
            int select = JOptionPane.YES_NO_OPTION;
                    JOptionPane.showConfirmDialog(null,null,"Try again?", select);
                    if(select == JOptionPane.NO_OPTION) {
                        System.exit(0);
                        if(select == JOptionPane.YES_OPTION) {
                            
                }
              }
            JOptionPane.showConfirmDialog(null, null, "Goodbye",
                                      JOptionPane.DEFAULT_OPTION);
   }
}
 
