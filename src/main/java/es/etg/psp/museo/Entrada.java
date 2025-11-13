package es.etg.psp.museo;

public class Entrada implements Runnable {
    private final Sala sala;

    public Entrada(Sala sala, int personasAEntrar) {
        this.sala = sala;
    }

    @Override
    public void run() {
        sala.incrementar();
    }
}
