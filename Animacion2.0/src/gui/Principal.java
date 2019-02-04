/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author nicol
 */
public class Principal extends JFrame{
    Dimension dimension = new Dimension(800,800);
    JFrame ventana = new JFrame();
    Lienzo lienzo;
    
    public void Principal(){
        iniciar();
    }
    public void iniciar(){
        lienzo = new Lienzo();
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        ventana.setSize(dimension);
        setLayout(null);
        add(lienzo);
        pack();
    }
    
}
