package com.iudigital.actividad.dosHilos;

public class ObtenerMayorPedido extends HiloLlenarPedidos {

    private static final int TAMANIO = 9000;

    public int obtenerMayorPedido(int[] Pedidos) {
        int max = 0;
        for (int i = 0; i < TAMANIO; i++) {
            if (Pedidos[i] > max) {
                max = Pedidos[i];
            }
        }
        return max;
    }
}
