import java.util.*;

class Teste_Hash{
    public static void main(String args[]){

        Set<String> mesesHash = new HashSet<>();

        mesesHash.add("Janeiro");
        mesesHash.add("Fevereiro");
        mesesHash.add("Março");
        mesesHash.add("Abril");
        mesesHash.add("Maio");
        mesesHash.add("Fevereiro");

        mesesHash.listar();
    }

    public void listar(){
        System.out.println("HashSet: ");
        System.out.println(mesesHash);
    }
}