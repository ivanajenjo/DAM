package com.ivanajenjo.repasoT2.ejercicio2;

public class Producto {

    int codigoProducto;
    String descripcion;
    double pvp;
    int existencias;

    public Producto() {
        this.codigoProducto = 0;
        this.descripcion = "";
        this.pvp = 0;
        this.existencias = 0;
    }

    public Producto(int codigoProducto, String descripcion, double pvp, int existencias) {
        this.codigoProducto = codigoProducto;
        this.descripcion = descripcion;
        this.pvp = pvp;
        this.existencias = existencias;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPvp() {
        return pvp;
    }

    public void setPvp(double pvp) {
        this.pvp = pvp;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigoProducto=" + codigoProducto +
                ", descripcion='" + descripcion + '\'' +
                ", pvp=" + pvp +
                ", existencias=" + existencias +
                '}';
    }

    public void mostrarProducto(){
        System.out.println(toString());
    }
}
