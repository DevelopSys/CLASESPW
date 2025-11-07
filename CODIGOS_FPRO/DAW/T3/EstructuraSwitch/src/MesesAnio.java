public enum MesesAnio {
    Enero("invierno", 1), Febrero("invierno", 2), Marzo("invierno", 3),
    Junio("verano", 6), Noviembre("invierno", 11);

    String estacion;
    int numero;

    MesesAnio(String estacionP, int numeroP) {
        estacion = estacionP;
        numero = numeroP;
    }

}
