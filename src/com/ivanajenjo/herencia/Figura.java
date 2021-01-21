package com.ivanajenjo.herencia;

public abstract class Figura {
    protected String color;
    protected int puntox;
    protected int puntoy;


    public Figura(String color, int puntox, int puntoy) {
        this.color = color;
        this.puntox = puntox;
        this.puntoy = puntoy;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPuntox() {
        return puntox;
    }

    public void setPuntox(int puntox) {
        this.puntox = puntox;
    }

    public int getPuntoy() {
        return puntoy;
    }

    public void setPuntoy(int puntoy) {
        this.puntoy = puntoy;
    }

    public abstract double area();
}
