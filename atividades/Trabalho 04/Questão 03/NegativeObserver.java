public class NegativeObserver implements Observer{
    public void update(Object data){
        if((double)data < 0){
            System.out.println("O resultado é negativo!");
        }
    }
}
