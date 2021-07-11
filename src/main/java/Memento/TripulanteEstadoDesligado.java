/*
Tripulante não trabalha mais na empresa
 */
package Memento;


public class TripulanteEstadoDesligado implements EstadoDoTripulante {

    private TripulanteEstadoDesligado() {};
    private static TripulanteEstadoDesligado instance = new TripulanteEstadoDesligado();
    public static TripulanteEstadoDesligado getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Desligado";
    }

    
    @Override
    public String disponibilizar(Tripulante tripulante) {
        return "O processo falhou";
    }

    @Override
    public String desligar(Tripulante tripulante) {
        return "O processo falhou";
    }

    @Override
    public String decolar(Tripulante tripulante) {
        return "O processo falhou";
    }

    @Override
    public String aterrissar(Tripulante tripulante) {
        return "O processo falhou";
    }

    @Override
    public String inativar(Tripulante tripulante) {
        return "O processo falhou";
    }
}
