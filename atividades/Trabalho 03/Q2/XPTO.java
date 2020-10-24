public abstract class XPTO{
    private static int countID = 0;
    private double credito;

    public abstract String getNome();

    public abstract int getContaID();

    public abstract void creditar(double valor);

    public abstract void debitar(double valor);

    public abstract String getSaldo();

    public abstract String toString();
}