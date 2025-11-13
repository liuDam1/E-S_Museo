package es.etg.psp.museo;

public class Museo {
    public static void main(String[] args) throws InterruptedException {
        Sala sala = new Sala();

        for (int i = 0; i < 10; i++) {
            Thread entrada = new Thread(new Entrada(sala, 1));
            entrada.start();
        }

        for (int i = 0; i < 15; i++) {
            Thread salida = new Thread(new Salida(sala, 1));
            salida.start();
        }
        
        System.out.println("Visitantes finales en la sala: " + sala.getPersonas());
    }
}