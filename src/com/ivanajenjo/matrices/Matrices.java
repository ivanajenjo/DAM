package com.ivanajenjo.matrices;

public class Matrices {

    public static void main(String[] args) {
        int[][] matriz1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] simetrica = {{1,2,3},{2,1,3},{3,3,1}};
        int[][] ejercicio2 = traspuesta(matriz1);
        printMatrix(ejercicio2);
        System.out.println(esSimetrica(matriz1));
        System.out.println(esSimetrica(simetrica));
    }

    public static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] traspuesta(int[][] matrix){
        int[][] resultado = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                resultado[j][i] = matrix[i][j];
            }
        }
        return resultado;
    }

    public static boolean esSimetrica(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != matrix[j][i]){
                    return false;
                }
            }
        }
        return true;
    }


}
