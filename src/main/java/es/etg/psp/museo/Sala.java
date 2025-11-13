package es.etg.psp.museo;

import lombok.Getter;

@Getter
public class Sala {
    private int personas = 100;
    
    public synchronized void incrementar() {
        personas++;
    }

    public synchronized void decrementar() {
        personas--;
    }
}