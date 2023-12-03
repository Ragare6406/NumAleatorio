
package numaleatorio;

import java.util.concurrent.Semaphore;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Semaphore semaforo = new Semaphore(1);

// Crear hilos y pasar el semáforo como parámetro
        for (int i = 1; i <= 10; i++) {
            Thread hilo = new HiloNumAle(i, semaforo);
            hilo.start();
        }
    }
}
