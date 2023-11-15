package a;
import java.util.Scanner;

//Clase CFilPrincipal
public class CFilPrincipal {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     

     System.out.print("Ingrese el número de procesos hijos: ");
     int numHijos = scanner.nextInt();

     if (numHijos <= 0 || numHijos > 10) {
         System.out.println("Número de procesos no válido. Debe estar entre 1 y 10.");
         return;
     }

     Cfil[] hijos = new Cfil[numHijos];
     hijos[0] = new Cfil("Hijo");
     hijos[0].setTemporizacion(3000); // Temporización en milisegundos
     hijos[0].start();

     for (int i = 0; i < numHijos; i++) {
         hijos[i] = new Cfil("Hijo" + (i + 1));
         hijos[i].setTemporizacion((i + 1) * 1000); // Temporización diferente para cada hijo
         hijos[i].start();
     }

     // Implementa el código principal aquí
     // Espera a que todos los hilos hijos terminen antes de continuar

     for (Cfil hijo : hijos) {
         try {
             hijo.join(); // Asegura que el hilo padre espere a cada hilo hijo
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }
     
 }
}
