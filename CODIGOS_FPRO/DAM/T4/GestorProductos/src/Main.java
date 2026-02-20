import controller.Gestor;
import model.Categoria;
import model.Producto;

import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
        Producto producto1 = new Producto("Telefono", "001T", 300.0, Categoria.TECNOLOGIA);
        Producto producto2 = new Producto("Television", "002T", 100.0, Categoria.TECNOLOGIA);
        Producto producto3 = new Producto("Portatil", "003T", 200.0, Categoria.TECNOLOGIA);
        // producto.mostrarDatos();
        Gestor gestor = new Gestor();
        // gestor.agregarProducto(producto1);
        // gestor.agregarProducto(producto2);
        // System.out.println(gestor.calcularPrecioMedio());

        /*
        // gestor.asignarPrecios();
        gestor.buscarPorCodigo("123A").ifPresentOrElse(Producto::mostrarDatos, () -> {
            // accion a realizar cuando el producto no este
        });

        gestor.getProductosPorCondicion((producto, valor) -> producto.getPrecio() < valor, 10.0);
        gestor.getProductosPorCondicion((producto, valor) -> producto.getPrecio() >= valor
                && producto.getCategoria() == Categoria.ALIMENTO, 10.0);

         */

        gestor.agregarProducto(producto3);
        gestor.agregarProducto(producto2);
        gestor.agregarProducto(producto1);

        // System.out.println(gestor.getEstadisticas().getMax());
        gestor.consultarProductos();

    }
}
