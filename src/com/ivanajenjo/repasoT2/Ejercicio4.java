package com.ivanajenjo.repasoT2;

public class Ejercicio4 {

    public static void main(String[] args) {
        int[][] matriz = new int[4][5];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int numero = (int) (Math.random()*9+1);
                matriz[i][j] = numero;
            }
        }
        imprimirMatriz(matriz);
    }
    private static void imprimirMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            int suma = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println(suma);
        }
        int sumatotal = 0;
        for (int i = 0; i < matriz[0].length; i++) {
            int suma = 0;
            for (int j = 0; j < matriz.length; j++) {
                suma += matriz[j][i];
            }
            sumatotal += suma;
            System.out.print(suma + "\t");
        }
        System.out.println(sumatotal);
    }
}
