package es.etg.psp.museo;

import lombok.Getter;

@Getter
public class Sala {
    private int personas = 100;
    
    public void incrementar() {
        personas++;
    }

    public void decrementar() {
        personas--;
    }
}