import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

class Variable implements Expression {
    private double var;
    private List<Observer> observersList = new ArrayList<>(1);

    Variable(double d){
        this.var = d;
    }

    public void addObserver(Observer... o){
        for(Observer ob : o){
            observersList.add(ob);
        }
    }

    public void notifyObservers(){
        Iterator<Observer> it = observersList.iterator();
        while(it.hasNext()){
            Observer aux = (Observer)it.next();
            aux.update(this.var);
        }
    }

    public double calculate(){
        this.notifyObservers();
        return this.var;
    }

}