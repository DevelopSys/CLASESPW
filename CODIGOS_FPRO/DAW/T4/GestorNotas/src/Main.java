import controller.Gestor;
import model.Categoria;
import model.Producto;

import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
        Producto television = new Producto("TV LG", "001LG_TEC", 600.0, Categoria.TECNOLOGICO);
        Producto movil = new Producto("Movil LG", "002LG_TEC", 200.0, Categoria.MUEBLES);
        Gestor gestor = new Gestor();
        gestor.agregarProducto(television);
        gestor.agregarProducto(movil);
        // System.out.println(gestor.calcularPrecioMedio());
        gestor.getProductosPorCondicion((item, val) -> item.getPrecio() > val && item.getCategoria() == Categoria.ROPA
                , 90.0);

        gestor.getProductosPorCondicion((item, val) -> item.getPrecio() < val && item.getCategoria() != Categoria.TECNOLOGICO
                , 90.0);

    }
}
