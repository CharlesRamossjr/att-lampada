package formula1.lampada;

public class Main {
    public static void main(String[] args) {

        Lampada l1 = new Lampada(true, 100);
        Lampada l2 = new Lampada(75);
        Lampada l3 = new Lampada();

        l1.mostrarEstado();
        l1.interruptor();

        l2.mostrarWatts();
        l3.mostrarWatts();
    }
}