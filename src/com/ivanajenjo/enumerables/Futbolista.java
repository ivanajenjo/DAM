package com.ivanajenjo.enumerables;

public class Futbolista {
    private int dorsal;
    private String Nombre;
    private Posicion posicion;
    private Equipo equipo;

    public Futbolista(int dorsal, String nombre, Posicion posicion, Equipo equipo) {
        this.dorsal = dorsal;
        Nombre = nombre;
        this.posicion = posicion;
        this.equipo = equipo;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Futbolista{" +
                "dorsal=" + dorsal +
                ", Nombre='" + Nombre + '\'' +
                ", posicion=" + posicion +
                ", equipo=" + equipo +
                '}';
    }
}
