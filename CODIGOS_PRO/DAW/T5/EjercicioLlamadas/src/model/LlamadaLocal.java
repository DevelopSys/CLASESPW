package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
public final class LlamadaLocal extends Llamada{

    public LlamadaLocal(long nOrigen, long nDestino, int duracion){
        super(nOrigen, nDestino, duracion);
    }

    public LlamadaLocal(){}
    @Override
    public void calcularCoste() {
        setCoste(0);
    }
}
