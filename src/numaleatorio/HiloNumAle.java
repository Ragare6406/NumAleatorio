package numaleatorio;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class HiloNumAle extends Thread {

    private int num;
    private Semaphore semaforo;

    public HiloNumAle(int num, Semaphore semaforo) {
        this.num = num;
        this.semaforo = semaforo;
    }

    @Override
    public void run() {
        // Generar un número aleatorio
        int numAleatorio = new Random().nextInt(100);

        try {
            semaforo.acquire(); //bloquea el semaforo
            System.out.println("Hilo " + num + " bloquea el semáforo para escribir en el archivo.");//mensaje en consola para comprobar funcionamiento
            
            // Llamar al método para agregar el número aleatorio al final del archivo
            NumAleatorio.agregarNumeroAlFinal("datos.txt", numAleatorio);
            
            Thread.sleep(1000);//Espera 1 segundos para la llegada del siguiente 
            System.out.println("Hilo " + num + " libera el semáforo.");
            semaforo.release();//se libera el semaforo
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
