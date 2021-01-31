package com.ivanajenjo.herencia;

public class Circulo extends Figura {
    protected int radio;

    public Circulo(){
        super("Azul", 0,0);
        this.radio = 5;
    }
    public Circulo(String color, int puntox, int puntoy, int radio) {
        super(color, puntox, puntoy);
        this.radio = radio;
    }

    @Override
    public double area() {
        return 0;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
}
