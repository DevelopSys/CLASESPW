package model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.List;

@Data
public class ProductosRespuesta {

    private List<Producto> products;
    private long total;
    private long skip;
    private long limit;
}
