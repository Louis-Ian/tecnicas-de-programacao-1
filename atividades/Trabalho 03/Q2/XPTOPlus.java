// # Exmeplo de inclusão
public class XPTOPlus extends XPTO{
    private static int countID = 0;
    public final int contaID;
    private double credito;
    
    // # Exmeplo de sobrecarga
    public XPTOPlus(){
        this(0.0);
    }

    // # Exmeplo de sobrecarga
    public XPTOPlus(double creditoA){
        contaID = (++countID);
        this.creditar(creditoA);
    }

    public String getNome(){
        return "XPTO Plus";
    }

    public int getContaID(){
        return contaID;
    }

    public void creditar(double valor){
        this.credito += valor + 0.005*valor;
    }

    public void debitar(double valor){
        this.credito -= valor;
    }

    public String getSaldo(){
        return String.valueOf(credito);
    }

    public String toString(){
        String s = "Conta " + this.getNome() + " " + this.getContaID();
        s += "\nSaldo: " + this.getSaldo();

        return s;
    }
}