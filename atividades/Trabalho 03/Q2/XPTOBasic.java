// # Exmeplo de inclusão
public class XPTOBasic extends XPTO{
    private static int countID = 0;
    public final int contaID;
    private double credito;
    
    // # Exmeplo de sobrecarga
    public XPTOBasic(){
        this(0.0);
    }

    // # Exmeplo de sobrecarga
    public XPTOBasic(double creditoA){
        contaID = (++countID);
        this.creditar(creditoA);
    }

    public String getNome(){
        return "XPTO Basic";
    }

    public int getContaID(){
        return contaID;
    }

    public void creditar(double valor){
        this.credito += valor;
    }

    public void debitar(double valor){
        this.creditar(-valor);
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