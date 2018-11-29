package org.bonilla.hilos;

public class Main {
    public static void main(String[] args) {
        Thread t = new Thread(new Proceso(), "Proceso 1");
        Thread t2 = new Thread(new Proceso(), "Proceso 2");
        Thread t3 = new ProcesoClase("Proceso 3");

        System.out.println("Hilos de la interface");
        t.start();
        t2.start();
        t3.start();
    }
}
