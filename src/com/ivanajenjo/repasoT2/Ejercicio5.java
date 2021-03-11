package com.ivanajenjo.repasoT2;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la primera cadena");
        String primera = sc.nextLine();
        System.out.println("Introduzca la segunda cadena");
        String segunda = sc.nextLine();
        String convertida = convertirAMayus(primera, segunda);
        System.out.println(convertida);
    }

    private static String convertirAMayus(String cadena1, String cadena2){
        int j, k=0;
        char[] primera = cadena1.toCharArray();
        char[] segunda = cadena2.toCharArray();
        if(segunda.length > primera.length){
            return new String(primera);
        }
        for (int i = 0; i < primera.length; i++) {
            if(primera[i] == segunda[0]){
                boolean coincide = true;
                j = i;
                k = 0;
                while (coincide){
                    if (primera[j] == segunda[k]){
                        j++;
                        k++;
                        if (k == segunda.length){
                            break;
                        }
                    }
                }
                for (int l = i; l < k+i; l++) {
                    primera[l] = Character.toUpperCase(primera[l]);
                }
            }
        }
        return new String(primera);
    }
}
