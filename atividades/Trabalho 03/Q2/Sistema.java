import java.util.ArrayList;

public class Sistema {
    ArrayList<XPTO> contas; 

    public Sistema(){
        contas = new ArrayList();

    }

    public void criarContaXPTOBasic(){
        XPTOBasic nc = new XPTOBasic();
        contas.add(nc);
    }

    public void criarContaXPTOPlus(){
        XPTOPlus nc = new XPTOPlus();
        contas.add(nc);
    }

    public void criarContaXPTOExtreme(){
        XPTOExtreme nc = new XPTOExtreme();
        contas.add(nc);
    }

    public void creditar(int i, double v){
        contas.get(i).creditar(v);
    }

    public void debitar(int i, double v){
        contas.get(i).debitar(v);
    }

    public String consultarSaldo(int i){
        return contas.get(i-1).getSaldo();
    }
}