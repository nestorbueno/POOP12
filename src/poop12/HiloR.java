package poop12;

/**
 * Clase HiloR que implementa Runnable.
 * Representa una tarea que puede ejecutarse en un hilo.
 *
 *
 * @author Nestor Bueno
 */
public class HiloR implements Runnable {

    /**
     * Método que se ejecuta cuando el hilo inicia.
     * Imprime un mensaje con el nombre del hilo actual.
     */
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName(); // Obtiene el nombre del hilo actual
        System.out.println("Iniciando " + threadName);
        try {
            Thread.sleep(1000); // Simula una tarea (pausa de 1 segundo)
        } catch (InterruptedException e) {
            System.out.println(threadName + " fue interrumpido.");
        }
        System.out.println("Finalizando " + threadName);
    }
}
