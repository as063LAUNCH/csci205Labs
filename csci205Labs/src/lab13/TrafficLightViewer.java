/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab13;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 *
 * @author as063
 */
public class TrafficLightViewer {
    public static void main(String[] args){
    //Create and set up the window.
        JFrame frame = new JFrame();
        frame.setBackground(Color.BLACK);
        frame.setSize(300,500);
        frame.getContentPane().setBackground(Color.BLACK);

        frame.setTitle("Traffic Light");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        TrafficLightComponent component = new TrafficLightComponent();
        frame.add(component);
        frame.setVisible(true);
    }
    
    static class TrafficLightComponent extends JComponent{
        @Override
        public void paintComponent(Graphics g){
            //Recover Graphics 2D
            Graphics2D g2 = (Graphics2D)g;
            //Construct a circle and draw it
            Ellipse2D.Double ellipse = new Ellipse2D.Double(80, 20, 100, 100);
            g2.setColor(Color.red);
            g2.fill(ellipse);
            g2.draw(ellipse);
            Ellipse2D.Double ellipse2 = new Ellipse2D.Double(80, 150, 100, 100);
            g2.setColor(Color.yellow);
            g2.fill(ellipse2);
            g2.draw(ellipse2);
            Ellipse2D.Double ellipse3 = new Ellipse2D.Double(80, 280, 100, 100);
            g2.setColor(Color.green);
            g2.fill(ellipse3);
            g2.draw(ellipse3);
        
    }    
}
    
}
