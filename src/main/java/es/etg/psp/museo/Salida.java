package es.etg.psp.museo;

public class Salida implements Runnable {
    private Sala sala;

    public Salida(Sala sala, int personasASalir) {
        this.sala = sala;
    }

    @Override
    public void run() {
        sala.decrementar();
        
    }
    
}
