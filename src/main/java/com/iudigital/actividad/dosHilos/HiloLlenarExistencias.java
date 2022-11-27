package com.iudigital.actividad.dosHilos;

import java.security.SecureRandom;

public class HiloLlenarExistencias extends Thread {

    private static final int TAMANIO = 9000;
    SecureRandom sr = new SecureRandom();
    int[] Existencias = new int[TAMANIO]; //PRODUCTOS
    private long initialTime;

    public HiloLlenarExistencias() {
    }

    @Override
    public void run() {
        System.out.println("El Hilo Llenar Existencias comienza "
                + "en el tiempo "
                + (System.currentTimeMillis() - this.initialTime) / 1000
                + " seg ");
        for (int i = 0; i < TAMANIO; i++) {
            Existencias[i] = sr.nextInt(TAMANIO);
            System.out.println("Hilo Almacenando Existencias : "+ i);
        }
        System.out.println("El Hilo Llenar Existencias "
                    + " ha terminado de procesar "
                    + " en el tiempo:  "
                    + (System.currentTimeMillis() - this.initialTime) / 1000
                    + "  seg ");
    }
}
