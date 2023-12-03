
package numaleatorio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;


public class NumAleatorio {
    public int num;

    public NumAleatorio() {
        num = 0;
    }

    public static void agregarNumeroAlFinal(String nombreArchivo, int numero) {
        try {
            // Crear un FileWriter con la opción de agregar al final del archivo
            FileWriter fileWriter = new FileWriter(nombreArchivo, true);

            // Crear un BufferedWriter para escribir el número en el archivo
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Escribir el número en una nueva línea
            bufferedWriter.newLine();
            bufferedWriter.write(Integer.toString(numero));
            // Cerrar el BufferedWriter
            bufferedWriter.close();

        } catch (IOException e) {
            System.err.println("Error al abrir o escribir en el archivo: " + e.getMessage());
        }
    }
}
