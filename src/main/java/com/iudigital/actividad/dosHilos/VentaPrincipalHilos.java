package com.iudigital.actividad.dosHilos;

public class VentaPrincipalHilos {

    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        
            HiloLlenarExistencias h1 = new HiloLlenarExistencias();
            h1.start();
        /*try {
            h1.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("Error en el hilo 1" + e);
        }*/
            HiloLlenarPedidos h2 = new HiloLlenarPedidos();
            h2.start();
        /*try{
        h2.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("Error en el hilo 2" + e);
        }  */   
            HiloLlenarInventarios h3 = new HiloLlenarInventarios();
            h3.start();
        /*try{
            h1.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("Error en el hilo 3" + e);
        }*/
        
        long fin = System.currentTimeMillis();
        long total = (fin - inicio);
        System.out.println("-------------Tardó: " + total + " ms---------");
    }
}
