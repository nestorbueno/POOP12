package poop12;

/**
 * Clase principal POOP12
 * Este programa demuestra el uso de hilos en Java mediante
 * dos enfoques: extender la clase Thread e implementar Runnable.
 * 
 * @author poo03alu05
 */
public class POOP12 {

    /**
     * Método principal del programa.
     * Crea e inicia múltiples hilos usando Thread y Runnable.
     * 
     * @param args los argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        // Creación de hilos extendiendo Thread
        Hilo h1 = new Hilo("Hilo1");
        Hilo h2 = new Hilo("Hilo2");
        Hilo h3 = new Hilo("Hilo3");

        // Iniciando los hilos
        h1.start();
        h2.start();
        h3.start();

        // Creación e inicio directo de hilos adicionales
        new Hilo("Hilo4").start();
        new Hilo("Hilo5").start();

        // Creación e inicio de hilos mediante Runnable
        new Thread(new HiloR(), "HiloR1").start();
        new Thread(new HiloR(), "HiloR2").start();
        new Thread(new HiloR(), "HiloR3").start();
    }
}
