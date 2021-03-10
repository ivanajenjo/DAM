package com.ivanajenjo.repasoT2;

import java.util.Scanner;

public class Ejercicio1 {

    static boolean[] asientos = new boolean[10];
    static int asientosOcupados = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            int asiento;
            if (asientosOcupados == 10) {
                System.out.println("Capacidad del avión al 100%");
                break;
            }
            System.out.println("Escriba 1 para primera clase");
            System.out.println("Escriba 2 para turista");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    asiento = reservarPrimera();
                    if (asiento == -1) {
                        System.out.println("No hay asientos disponibles en Primera");
                        System.out.println("Desea reservar en Turista?");
                        System.out.println("1 - SI \t 2 - NO");
                        int cambioClase = sc.nextInt();
                        if (cambioClase == 1) {
                            asiento = reservarTurista();
                            imprimirBillete(asiento);
                        }
                    } else {
                        imprimirBillete(asiento);
                    }
                    break;
                case 2:
                    asiento = reservarTurista();
                    if (asiento == -1) {
                        System.out.println("No hay asientos disponibles en Turista");
                        System.out.println("Desea reservar en Primera?");
                        System.out.println("1 - SI \t 2 - NO");
                        int cambioClase = sc.nextInt();
                        if (cambioClase == 1) {
                            asiento = reservarPrimera();
                            imprimirBillete(asiento);
                        }
                    } else {
                        imprimirBillete(asiento);
                    }
                    break;
                default:
                    System.out.println("Por favor introduzca una opción válida");
            }
        }
    }

    public static void imprimirBillete(int asiento) {
        System.out.println("Su asiento es: " + (asiento + 1));
    }

    public static int reservarPrimera() {
        for (int i = 0; i < 5; i++) {
            if (!asientos[i]) {
                asientos[i] = true;
                asientosOcupados++;
                return i;
            }
        }
        return -1;
    }

    public static int reservarTurista() {
        for (int i = 5; i < 10; i++) {
            if (!asientos[i]) {
                asientos[i] = true;
                asientosOcupados++;
                return i;
            }
        }
        return -1;
    }
}
