package poop12;

/**
 * Clase Hilo
 * Extiende la clase Thread para crear un hilo personalizado.
 * Sobrescribe el método run() para ejecutar una tarea específica.
 * 
 * Incluye sincronización para garantizar que los recursos compartidos
 * sean manejados de forma segura cuando múltiples hilos acceden al mismo código.
 * 
 * @author Nestor bueno
 */
public class Hilo extends Thread {

    /**
     * Constructor que asigna un nombre al hilo.
     * 
     * @param name el nombre del hilo
     */
    public Hilo(String name) {
        super(name); // Asigna el nombre del hilo al crearlo
    }

    /**
     * Método que se ejecuta cuando el hilo inicia.
     * Este método está sincronizado para garantizar la ejecución ordenada
     * en entornos multihilo.
     */
    @Override
    public synchronized void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteración " + i + " del hilo " + getName());
        }
        System.out.println("Termina " + getName());
    }
}
