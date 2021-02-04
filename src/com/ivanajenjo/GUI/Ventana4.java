package com.ivanajenjo.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana4 extends JFrame {
    private JButton boton1;
    private JLabel label1;

    public Ventana4(){
        setLayout(new FlowLayout());
        boton1 = new JButton("Pulsa");
        label1 = new JLabel("Pulsaciones: 0");
        add(boton1);
        add(label1);
        boton1.addActionListener(new OyenteBotonPulsacion());
        setSize(400,300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private class OyenteBotonPulsacion implements ActionListener {
        private int contador;

        @Override
        public void actionPerformed(ActionEvent e) {
            contador++;
            label1.setText("Pulsaciones: " + contador);
        }
    }

    public static void main(String[] args) {
        Ventana4 v4 = new Ventana4();
    }
}
