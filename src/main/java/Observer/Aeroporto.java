package observer;

import java.util.Observable;

public class Aeroporto extends Observable {

    private int id;
    private String nome;
    private String local;

    public Aeroporto(int id, String nome, String local) {
        this.id = id;
        this.nome = nome;
        this.local = local;
    }
    
    public void mudancaNoPouso() {
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Aeroporto{" +
                "id=" + id +
                ", nome=" + nome +
                ", local='" + local + 
                '}';
    }
}

