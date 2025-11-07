public enum MesesAnio {
    Enero("invierno", 1, 31), Febrero("invierno", 2, 28), Marzo("primavera", 3, 31),
    Abril("primavera", 4, 30), Mayo("primavera", 5, 31), Junio("verano", 6, 30),
    Noviembre("otoño", 11, 30);

    int numeroMes;
    String estacion;
    int diasMes;

    // me vale para crear los enum de MesesAnio
    MesesAnio(String estacionP, int numeroMesP, int diasMesP) {
        estacion = estacionP;
        numeroMes = numeroMesP;
        diasMes = diasMesP;
    }
}
