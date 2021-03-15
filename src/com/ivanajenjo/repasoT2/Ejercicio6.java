package com.ivanajenjo.repasoT2;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una palabra");
        String palabra = sc.nextLine();
        String espejo = palabraEspejo(palabra);
        System.out.println(espejo);
    }

    public static String palabraEspejo(String palabra){
        char[] letras = palabra.toCharArray();
        String res = palabra;
        for (int i = letras.length - 2; i >= 0; i--) {
            res += letras[i];
        }
        return res;
    }
}
