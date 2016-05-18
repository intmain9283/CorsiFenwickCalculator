/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corsifenwickcalculator;

import javax.swing.*;
/**
 *
 * @author Vincent
 */
public class CorsiFenwickCalculator {
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new CorsiForPanel());
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }
    
}
