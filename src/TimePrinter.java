/*
 * TimePrinter.java Imprime la hora cada segundo.
 */
public class TimePrinter implements Runnable {
    public void run() {
        while (true) {
            System.out.println(new java.util.Date());
            try {
                Thread.sleep(1000); // milis
            } catch (InterruptedException x) {
                System.out.println("Macarrones");
            }
        }
    }

    public static void main(String[] args) {
        final Runnable tarea = new TimePrinter();
        new Thread(tarea, "Hilo de TimePrinter").start();
// resto del programa
    }
}
