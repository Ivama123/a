package a;

public class Cfil extends Thread {
    private String nombre;
    private long temporizacion;

    public Cfil(String nombre) {
        this.nombre = nombre;
        // Inicializar la temporización según sea necesario
    }

    public String getNombre() {
        return nombre;
    }

    public void setTemporizacion(long temporizacion) {
        this.temporizacion = temporizacion;
    }

    @Override
    public void run() {
        // Implementa el código del hilo aquí
        // Utiliza la temporización para controlar la duración del hilo

        try {
            Thread.sleep(temporizacion); // Simula la ejecución del hilo
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(nombre + " ha terminado su ejecución.");
    }
}
