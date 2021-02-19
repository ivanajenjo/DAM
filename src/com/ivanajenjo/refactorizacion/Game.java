package com.ivanajenjo.refactorizacion;

public class Game {

    Player p;

    //...

    public void movement(String m){
        if (m.equalsIgnoreCase("Derecha")){
            p.setX(p.getX()+1);
        }

        if (m.equalsIgnoreCase("Izquierda")){
            p.setX(p.getX()+1);
        }

        if (m.equalsIgnoreCase("Arriba")){
            p.setX(p.getX()+1);
        }

        if (m.equalsIgnoreCase("Abajo")){
            p.setX(p.getX()+1);
        }
    }
}
