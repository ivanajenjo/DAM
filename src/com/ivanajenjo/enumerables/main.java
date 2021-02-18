package com.ivanajenjo.enumerables;

public class main {
    public static void main(String[] args) {
        Posicion posicion1 = Posicion.PORTERO;
        System.out.println(posicion1.name());
        System.out.println(posicion1.ordinal());
        System.out.println(posicion1.toString());

        Equipo equipo1 = Equipo.REAL_MADRID;
        System.out.println(equipo1.name());
        System.out.println(equipo1.ordinal());
        System.out.println(equipo1.toString());
        System.out.println(equipo1.getNombreClub());
        System.out.println(equipo1.getPuestoLiga());

        Futbolista messi = new Futbolista(10, "Leo", Posicion.DELANTERO, Equipo.BARÇA);
        System.out.println(messi);
    }
}
