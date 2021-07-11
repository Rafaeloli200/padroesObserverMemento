/*
Tripulante em  trabalho, fora de um voo, localizado em uma cidade diferente de sua moradia
 */
package Memento;


public class TripulanteEstadoExterior implements EstadoDoTripulante {

    private TripulanteEstadoExterior() {};
    private static TripulanteEstadoExterior instance = new TripulanteEstadoExterior();
    public static TripulanteEstadoExterior getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Exterior";
    }

    
    @Override
    public String disponibilizar(Tripulante tripulante) {
        return "O processo falhou";
    }

    @Override
    public String desligar(Tripulante tripulante) {
        return "Tripulante desligado";
    }

    @Override
    public String decolar(Tripulante tripulante) {
        return "Tripulante em voo";
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
