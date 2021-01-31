package com.ivanajenjo.GUI;

import java.awt.*;

public class Ventana3 extends Frame {

    private Button b1,b2,b3,b4,b5,b6;

    public Ventana3(){
        super("Esta es la Ventana 3");
        setLayout(new GridLayout(3,2));

        b1 = new Button("Boton 1");
        add(b1);
        b2 = new Button("Boton 2");
        add(b2);
        b3 = new Button("Boton 3");
        add(b3);
        b4 = new Button("Boton 4");
        add(b4);
        b5 = new Button("Boton 5");
        add(b5);
        b6 = new Button("Boton 6");
        add(b6);

        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        Ventana3 v3 = new Ventana3();
    }
}
