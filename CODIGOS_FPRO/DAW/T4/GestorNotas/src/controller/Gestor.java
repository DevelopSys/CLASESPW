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
        // existe el codigo
        // recorro - pregunto - rompo - decido

        // productos.stream().filter() // Stream -> los que han cumplido
        // bool -> si / no coincide
        boolean existe =
                productos.stream()
                        .anyMatch(item -> item.getCodigo().equalsIgnoreCase(p.getCodigo()));
        if (existe) {
            System.out.println("Codigo ya usado, no se puede agregar");
        } else {
            productos.add(p);
            System.out.println("Producto agregado correctamente");
        }

        /*
        if (buscarPorCodigo(p.getCodigo()).isPresent()){
            System.out.println("No puedo agregar, codigo duplicado");
        } else {
            productos.add(p);
        }*/
    }

    public void asignarPrecios() {
        productos.stream()
                .filter(item -> item.getPrecio() < 0)
                .forEach(item -> item.setPrecio((Math.random() * 100) + 1));
    }

    public void mostrarProductos() {
        // productos.forEach(item->item.mostrarDatos());
        productos.forEach(Producto::mostrarDatos);
    }

    public double calcularPrecioMedio() {
        // recorro - capturo precio - sumo a sumatorio - divido / size - retono
        // p1       p2      p3      p4      p5
        // -        -       -       -       -
        // precio   precio  precio  precio  precio -> media
        return productos
                .stream()
                .mapToDouble(Producto::getPrecio)
                .average()
                .orElse(0.0);
    }

    public long getNumeroProductosCaros(double limite) {
        return productos.stream().filter(item -> item.getPrecio() >= limite).count();
    }

    public List<Producto> getLsitaProductosCaros(double limite) {
        return productos.stream().filter(item -> item.getPrecio() >= limite).toList();
    }

    public Optional<Producto> buscarPorCodigo(String codigo) {
        return productos.stream()
                .filter(item -> item.getCodigo().equalsIgnoreCase(codigo))
                .findFirst();
    }

    public void ordendarProductos() {
        productos.sort(Comparator.comparingDouble(Producto::getPrecio).reversed());
    }

    public List<Producto> getProductosPorCondicion(BiPredicate<Producto, Double> condicion
            , double valor) {
        return productos.stream().filter(item -> condicion.test(item, valor)).toList();
    }

}
