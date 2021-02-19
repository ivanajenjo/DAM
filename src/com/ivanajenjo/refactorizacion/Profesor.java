package com.ivanajenjo.refactorizacion;

import java.util.ArrayList;

public class Profesor extends Persona{

   String str;
   int edad;
   String numeroTelefono;
   ArrayList<String> prestamos;


    public Profesor(String numeroTelefono) {
        super(numeroTelefono);
    }

    public void printInformacionPersonal(){
        System.out.println("Nombre: " + str);
        System.out.println("Edad: " + edad);
        System.out.println("Teléfono: " + numeroTelefono);
    }

    public void printTodaLaInformacion(){
        System.out.println("Nombre: " + str);
        System.out.println("Edad: " + edad);
        System.out.println("Teléfono: " + numeroTelefono);
        for (String libro:prestamos) {
            System.out.println(libro);
        }
    }
}
