package org.bonilla.hilos;

public class Proceso implements Runnable {

    @Override
    @SuppressWarnings("Duplicates")
    public void run() {
        System.out.println("Indicando el envío de correos");
        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
            // Código que envia correos
            System.out.println("Ejecutando el proceso...");
            new SendMail().sendMail();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Fin del poceso de envío de correos");
        System.out.println(Thread.currentThread().getName());
    }
}
