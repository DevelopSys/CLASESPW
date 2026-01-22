package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public final class LlamadaNacional extends Llamada {

    private int franja;

    public LlamadaNacional(long nOrigen, long nDestino, int duracion, int franja){
        super(nOrigen, nDestino, duracion);
        if(franja<0 || franja>3){
            this.franja = 3;
        } else {
            this.franja = franja;
        }
        calcularCoste();
    }

    @Override
    public void calcularCoste() {
        switch (franja){
            case 1->{setCosteSegundo(0.20);}
            case 2->{setCosteSegundo(0.25);}
            case 3->{setCosteSegundo(0.30);}
        }
        setCoste(getDuracion()*getCosteSegundo());
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("franja = " + franja);
    }
}
