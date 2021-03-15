package com.ivanajenjo.repasoT2;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una frase");
        String frase = sc.nextLine();
        String cambiada = cambiarPalabras(frase);
        System.out.println(cambiada);
    }

    public static String cambiarPalabras(String frase){
        String[] palabras = frase.split(" ");
        String aux = palabras[0];
        palabras[0] = palabras[palabras.length-1];
        palabras[palabras.length-1] = aux;
        String res = "";
        for (int i = 0; i < palabras.length; i++) {
            res += palabras[i];
            res += " ";
        }
        return res;
    }
}
