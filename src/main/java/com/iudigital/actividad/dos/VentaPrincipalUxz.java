package com.iudigital.actividad.dos;

public class VentaPrincipalUxz {
    
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        VentaProductosUxz v = new VentaProductosUxz();
        v.almacenaExistencias();
        v.almacenaPedidos();
        v.almacenaInventarios();
        v.obtenerMayorPedidos();
        long fin = System.currentTimeMillis();
        long total = fin - inicio;
        System.out.println("---El proceso sin Hilos tardó: " + total + " ms---------");
    }

}
