package com.iudigital.actividad.dosHilos;

import java.security.SecureRandom;

public class HiloLlenarPedidos extends Thread {

    private static final int TAMANIO = 9000;
    SecureRandom sr = new SecureRandom();
    int[] Pedidos = new int[TAMANIO]; //PEDIDOS
    private long initialTime;

    public HiloLlenarPedidos() {
    }

    @Override
    public void run() {
        System.out.println("El Hilo Llenar Pedidos comienza "
                + "en el tiempo "
                + (System.currentTimeMillis() - this.initialTime) / 1000
                + " seg ");
        for (int i = 0; i < TAMANIO; i++) {
            Pedidos[i] = sr.nextInt(TAMANIO);
            System.out.println("Hilo Almacenando Pedidos " + i);
        }
            ObtenerMayorPedido h4 = new ObtenerMayorPedido();
        int mayorpedido=h4.obtenerMayorPedido(Pedidos);
        System.out.println("La cantidad de la venta mayor es " + mayorpedido);
    
           
        System.out.println("El Hilo Llenar Pedidos " + " ha terminado de procesar "
                + " en el tiempo:  "
                + (System.currentTimeMillis() - this.initialTime) / 1000
                + "  seg ");
    }
}


