package es.etg.psp.museo;

public class Museo {
    private static final String MSG_TOTAL_PERSONAS = "Visitantes finales en la sala: ";
    private static final int TIEMPO_ESPERA = 2000;
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
        
        Thread.sleep(TIEMPO_ESPERA);
        System.out.println(MSG_TOTAL_PERSONAS + sala.getPersonas());
    }
}
