public class Cajero {
    // atributos -> caracteristicas (cualifican)
    private int saldo;

    // constuctores -> inicializar el elemento
    public Cajero() {
        saldo = 1000;
    }
    // metodos -> funcionalidades

    public void ingresarDinero(int dinero) {
        saldo += dinero;
    }

    public void sacarDinero(int dinero) {
        saldo -= dinero;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
