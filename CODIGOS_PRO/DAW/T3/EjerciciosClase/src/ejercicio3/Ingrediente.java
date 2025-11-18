package ejercicio3;

public enum Ingrediente {

    Queso(20), Jamon(12), Piña(8), Pepperoni(10), Tomate(6);

    int precio;

    Ingrediente(int precioP) {
        precio = precioP;
    }
}
