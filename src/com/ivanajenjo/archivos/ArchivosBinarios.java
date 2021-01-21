package com.ivanajenjo.archivos;

import java.io.*;

public class ArchivosBinarios {
    public static void main(String[] args){
        String fichero = "calificaciones.data";
        String nombre = "PRG";
        int conv = 1;
        double nota = 7.8;
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fichero));
            out.writeUTF(nombre); out.writeInt(conv); out.writeDouble(nota);
            out.close();
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File(fichero)));
            System.out.println("Valor leído de nombre: " + in.readUTF());
            System.out.println("Valor leído de convocatoria: " + in.readInt());
            System.out.println("Valor leído de nota: " + in.readDouble());
            in.close();
        } catch (FileNotFoundException e) {
            System.err.println("Problemas con el fichero " + fichero + "." + e.getMessage());
        } catch (IOException e) {
            System.err.println("Problemas al escribir en el fichero " + fichero);
        }}
}
