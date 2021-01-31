package com.ivanajenjo.GUI;

import java.awt.*;

public class Ventana2 extends Frame {
    private Button bNorte, bSur, bOeste, bEste, bCentro;

    public Ventana2(){
        super("Esta es la ventana 2");
        setLayout(new BorderLayout());

        bNorte = new Button("Norte");
        add(bNorte, BorderLayout.NORTH);

        bSur = new Button("Sur");
        add(bSur, BorderLayout.SOUTH);

        bOeste = new Button("Oeste");
        add(bOeste, BorderLayout.WEST);

        bEste = new Button("Este");
        add(bEste, BorderLayout.EAST);

        bCentro = new Button("Centro");
        add(bCentro, BorderLayout.CENTER);

        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        Ventana2 v2 = new Ventana2();
    }
}
