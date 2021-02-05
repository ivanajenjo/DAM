package com.ivanajenjo.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana5 extends JFrame{
    private JButton rojo, azul;
    private Container p;

    public Ventana5(){
        super("Color de fondo");
        rojo = new JButton("Rojo");
        azul = new JButton("Azul");
        p=this.getContentPane();
        setLayout(new FlowLayout());
        add(rojo);
        add(azul);
        rojo.addActionListener(new ListenerRojo());
        azul.addActionListener(new ListenerAzul());
        setSize(300,300);
        setVisible(true);
    }

    private class ListenerRojo implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    private class ListenerAzul implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
}
