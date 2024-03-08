package AlgoBonito;

public abstract class Cuenta {
    protected double saldo;
    protected boolean estadoDeCuenta = true;

    // constructores
    public Cuenta() {
    }

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isEstadoDeCuenta() {
        return estadoDeCuenta;
    }

    public void setEstadoDeCuenta(boolean estadoDeCuenta) {
        this.estadoDeCuenta = estadoDeCuenta;
    }
    
}