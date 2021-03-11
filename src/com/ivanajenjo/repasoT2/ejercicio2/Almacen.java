package com.ivanajenjo.repasoT2.ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Almacen {

    static Scanner sc;
    static ArrayList<Producto> almacen = new ArrayList<Producto>();

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("Cuantos productos desea introducir?");
        int cantidad = sc.nextInt();
        for (int i = 0; i < cantidad; i++) {
            insertarProducto();
        }
        System.out.println("Introduzca uno de los codigos de producto.");
        int codigo = sc.nextInt();
        mostrarProducto(codigo);
        System.out.println("El almacen contiene " + productosAlmacenados() + " productos");
    }

    public static void insertarProducto(){
        System.out.println("Introduzca el código de producto");
        int codigo = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduzca la descripción del producto");
        String descripcion = sc.nextLine();
        System.out.println("Introduzca el PVP");
        double pvp = sc.nextDouble();
        System.out.println("Introduzca las existencias");
        int existencias = sc.nextInt();
        Producto producto = new Producto(codigo, descripcion, pvp, existencias);
        almacen.add(producto);
    }

    public static void mostrarProducto(int codigo){
        for (Producto prod:almacen) {
            if (prod.getCodigoProducto() == codigo){
                prod.mostrarProducto();
            }
        }
    }

    public static int productosAlmacenados(){
        return almacen.size();
    }
}
