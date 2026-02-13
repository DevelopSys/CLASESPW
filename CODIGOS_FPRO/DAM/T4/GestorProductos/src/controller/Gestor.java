package controller;

import model.Producto;

import java.util.*;
import java.util.function.BiPredicate;

public class Gestor {
    private List<Producto> productos;

    public Gestor() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        // recorrer - preguntar - bool
        // productos.stream().filter().count() > 0; // retorna un stream
        /*
        boolean existe = productos.stream().anyMatch(item -> item.getCodigo()
                .equalsIgnoreCase(p.getCodigo())); // retorna un bool
        if (existe) {
            System.out.println("Codigo utilizado, puedes volver a intentarlo");
        } else {
            productos.add(p);
        }*/
        if (buscarPorCodigo(p.getCodigo()).isPresent()){
            System.out.println("El codigo ya se utiliza");
        } else {
            productos.add(p);
            System.out.println("Productoa agregado correctamente");
        }
    }

    public void asignarPrecios() {
        // recorro, pregunto, cambio
        productos
                .stream()
                .filter(item -> item.getPrecio() < 0)
                .forEach(item -> item.setPrecio((Math.random() * 100) + 1));
    }

    public void mostrarDatos() {
        productos.forEach(Producto::mostrarDatos);
    }

    public double calcularPrecioMedio() throws NoSuchElementException {
        /*return (productos.stream()
                .mapToDouble(Producto::getPrecio)
                .sum())/productos.size();*/
        return productos.stream()
                .mapToDouble(Producto::getPrecio)
                .average()
                .orElse(0.0);
    }

    public long getNumeroProductosCaros(double limite) {
        return productos.stream().filter(item -> item.getPrecio() >= limite).count();
    }

    public List<Producto> getProductosCaros(double limite){
        return productos.stream().filter(item->item.getPrecio()>=limite).toList();
    }
    public Optional<Producto> buscarPorCodigo(String codigo){
        return productos.stream()
                .filter(item->item.getCodigo().equalsIgnoreCase(codigo))
                .findFirst();
    }

    public void ordenarDescendente(){
        productos.sort(Comparator.comparingDouble(Producto::getPrecio).reversed());
    }

    public List<Producto> getProductosPorCondicion(BiPredicate<Producto,Double> condicion, double param){
        return productos.stream()
                .filter(item -> condicion.test(item,param))
                .toList();
    }

}
