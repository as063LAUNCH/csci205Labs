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
import java.awt.geom.Line2D;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 *
 * @author as063
 */
public class LineDistanceViewer {
    public static void main(String[] args){
    //Create and set up the window.
        JFrame frame = new JFrame();
        frame.setSize(300,500);
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);

        frame.setTitle("Line Distance Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        LineDistanceComponent component = new LineDistanceComponent();
        frame.add(component);
        frame.setVisible(true);
    }
    
    static class LineDistanceComponent extends JComponent{
        @Override
        public void paintComponent(Graphics g){
            Graphics2D g2 = (Graphics2D) g;
        
        g2.setColor(Color.BLACK);
        Ellipse2D.Double point1 = new Ellipse2D.Double( 100, 100 , 3, 3);
        Ellipse2D.Double point2 = new Ellipse2D.Double( 200, 200 , 3, 3);
        g2.fill(point1);
        g2.fill(point2);
        
        Line2D.Double line = new Line2D.Double(100,100,200,200);
        g2.draw(line);
        
        Ellipse2D.Double point3 = new Ellipse2D.Double( 100, 200 , 3, 3);
        g2.fill(point3);
        double dist_1 = line.ptSegDist(100, 200);
        g2.drawString("Distance:" + dist_1, 100, 200);

        Ellipse2D.Double point4 = new Ellipse2D.Double( 150, 150 , 3, 3);
        g2.fill(point4);
        double dist_2 = line.ptSegDist(150, 150);        
        g2.drawString("Distance:" + dist_2, 150, 150);
        
        Ellipse2D.Double point5 = new Ellipse2D.Double( 250, 50 , 3, 3);
        g2.fill(point5);
        double dist_3 = line.ptSegDist(250, 50);
        g2.drawString("Distance:" + dist_3, 250, 50);
    }
           
        }
    }  
