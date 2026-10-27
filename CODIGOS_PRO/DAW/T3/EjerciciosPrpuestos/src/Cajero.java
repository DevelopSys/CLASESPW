public class Cajero {
    private int saldo;
    public Cajero(){
        saldo = 1000;
    }

    public void ingresarDinero(int dinero){
        System.out.println("Procedemos a ingresar dinero en cuenta");
        saldo +=dinero;
    }

    public void retirarDinero(int dinero){
        saldo-=dinero;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
