package com.ivanajenjo.herencia;

public class Triangulo extends Figura{
    protected int base;
    protected int altura;

    public Triangulo(String color, int puntox, int puntoy, int base, int altura) {
        super(color, puntox, puntoy);
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public double area() {
        return base * altura / 2;
    }
}
