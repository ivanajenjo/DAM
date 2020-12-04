package com.ivanajenjo.hanoi;

public class TorresHanoi {
    public static int numeroMovimientos;
    public static void main(String[] args) {
        numeroMovimientos = 0;
        torresHanoi(4,1,2,3);
        System.out.println(numeroMovimientos);
    }

    public static void torresHanoi(int discos, int torre1, int torre2, int torre3){
        if (discos == 1){
            System.out.println("Mover disco de Torre " + torre1 + " a Torre " + torre3);
            numeroMovimientos++;
        }else{
            torresHanoi(discos-1, torre1, torre3, torre2);
            System.out.println("Mover disco de Torre " + torre1 + " a Torre " + torre3);
            numeroMovimientos++;
            torresHanoi(discos-1, torre2, torre1, torre3);
        }
    }
}
