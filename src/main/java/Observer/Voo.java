package observer;

import java.util.Observable;
import java.util.Observer;

public class Voo implements Observer {

    private int id;
    private String origem;
    private String destino;
    private String ultimaNotificacao;

    public Voo(int id, String origem, String destino) {
        this.id = id;
        this.origem = origem;
        this.destino = destino;
    }


    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }

    public void marcarVoo(Aeroporto aeroporto) {
        aeroporto.addObserver(this);
    }

    public void update(Observable aeroporto, Object arg1) {
        this.ultimaNotificacao = this.id + ", mudança no local de pouso " + aeroporto.toString();
        // System.out.println(this.ultimaNotificacao);
    }

    
}
