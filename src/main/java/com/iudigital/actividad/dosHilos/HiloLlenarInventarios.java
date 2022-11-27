package com.iudigital.actividad.dosHilos;

public class HiloLlenarInventarios extends Thread {

    private static final int TAMANIO = 9000;
    int[] Existencias = new int[TAMANIO]; //PRODUCTOS
    int[] Pedidos = new int[TAMANIO]; //PEDIDOS
    int[] Inventarios = new int[TAMANIO]; //INVENTARIO
    private long initialTime;

    public HiloLlenarInventarios() {
    }

    @Override
    public void run() {
        System.out.println("El Hilo Llenar Inventarios comienza " 
                + "en el tiempo "
                + (System.currentTimeMillis() - this.initialTime) / 1000
                + " seg ");

        for (int i = 0; i < TAMANIO; i++) {
            int val = 0;
            if (Existencias[i] == Pedidos[i]) {
                val = Existencias[i];
            } else if (Pedidos[i] > Existencias[i]) {
                val = 2 * (Pedidos[i] - Existencias[i]);
            } else {
                val = Pedidos[i];
            }
            Inventarios[i] = val;
            System.out.println("Hilo Almacenando Inventarios: " + i);
        }
        System.out.println("El hilo Llenar Inventarios "
                    + " ha terminado de procesar "
                    + " en el tiempo:  "
                    + (System.currentTimeMillis() - this.initialTime) / 1000
                    + "  seg ");
    }
}
