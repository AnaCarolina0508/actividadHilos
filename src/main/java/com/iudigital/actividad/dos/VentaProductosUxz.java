package com.iudigital.actividad.dos;
/*@author Ana Carolina González Alzate*/

import java.security.SecureRandom;

public class VentaProductosUxz {

    private static final int TAMANIO = 9000;

    SecureRandom sr = new SecureRandom();

    int[] Existencias = new int[TAMANIO]; //PRODUCTOS
    int[] Pedidos = new int[TAMANIO]; //PEDIDOS
    int[] Inventarios = new int[TAMANIO]; //INVENTARIO
  

    public void almacenaExistencias() {
        for (int i = 0; i < TAMANIO; i++) {
            Existencias[i] = sr.nextInt(TAMANIO);
            System.out.println("Almacenando existencia de productos: " + i);
        }
    }

    public void almacenaPedidos() {
        for (int i = 0; i < TAMANIO; i++) {
            Pedidos[i] = sr.nextInt(TAMANIO);
            System.out.println("Almacenando cantidad de pedidos: " + i);
        }
    }

    public void almacenaInventarios() {
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
            System.out.println("Almacenando pedidos para mantener el stock " + i);
        }
    }

    public void obtenerMayorPedidos() {
        int max = 0; 
        for (int b : Pedidos){
            if(b>max){
                max = b;
            }
        }
        /*int max = 0;
        for (int i = 0 ; i < TAMANIO; i++) {
            if (Pedidos[i] > max) {
                max = Pedidos[i];
            }
        }*/
        System.out.println("----El pedido de mayor valor es " + max +"--------");
    }
}
