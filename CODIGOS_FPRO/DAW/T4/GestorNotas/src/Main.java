import controller.Gestor;
import model.Categoria;
import model.Producto;

import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
        Producto television = new Producto("TV LG", "001LG_TEC", 600.0, Categoria.TECNOLOGICO);
        Producto movil = new Producto("Movil LG", "002LG_TEC", 700.0, Categoria.MUEBLES);
        Producto zapatillas = new Producto("Zapatilla", "003NK_ZAP", 300.0, Categoria.ROPA);
        Gestor gestor = new Gestor();
        gestor.agregarProducto(television);
        gestor.agregarProducto(movil);
        gestor.agregarProducto(zapatillas);
        // System.out.println(gestor.calcularPrecioMedio());
        /*
        gestor.getProductosPorCondicion((item, val) -> item.getPrecio() > val && item.getCategoria() == Categoria.ROPA
                , 90.0);

        gestor.getProductosPorCondicion((item, val) -> item.getPrecio() < val && item.getCategoria() != Categoria.TECNOLOGICO
                , 90.0);

         */
        // System.out.println(gestor.getEstadisticas().getMax());
        gestor.obtenerProductosAPI();
    }
}
