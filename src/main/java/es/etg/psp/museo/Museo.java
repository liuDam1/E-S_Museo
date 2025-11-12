package es.etg.psp.museo;

public class Museo {
    public static void main(String[] args) {
        Sala sala = new Sala();

        for (int i = 0; i < 10; i++) {
            Thread entarda = new Thread(new Entrada(sala, 1));
            entarda.start();
        }

        for (int i = 0; i < 15; i++) {
            Thread salida = new Thread(new Salida(sala, 1));
            salida.start();
        }

        System.out.println(sala.toString());
    }
}