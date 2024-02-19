/*
 * TimePrinter.java Imprime la hora cada segundo.
 */
public class TimePrinter implements Runnable {


    private final String name = Thread.currentThread().getName();
    public void run() {
        while (true) {
            System.out.println(new java.util.Date() + name);
            try {
                Thread.sleep(1000); // milis
            } catch (InterruptedException x) {
                System.out.println("Macarrones");
            }
        }
    }

    public static void main(String[] args) {
        final Runnable tarea = new TimePrinter();
        Thread hilo1 = new Thread(tarea, "Hilo de TimePrinter 1");
        Thread hilo2 = new Thread(tarea, "Hilo de TimePrinter 2");

        hilo1.start();
        hilo2.start();

        System.out.println(hilo1.getName());
        System.out.println(hilo2.getName());

        try {
            hilo1.join();
        } catch (InterruptedException e) {
            System.out.println("Hubo error jijijija");
        }
        try {
            hilo2.join();
        } catch (InterruptedException e) {
            System.out.println("Hubo error jijijija");
        }
        // resto del programa
    }
}
