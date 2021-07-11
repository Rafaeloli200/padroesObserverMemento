/*
Tripulante em  trabalho, fora de um voo, localizado na cidade de sua moradia
 */
package Memento;

public class TripulanteEstadoDisponivel implements EstadoDoTripulante {

    private TripulanteEstadoDisponivel() {
    }
    ;
    private static TripulanteEstadoDisponivel instance = new TripulanteEstadoDisponivel();

    public static TripulanteEstadoDisponivel getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Ativo";
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
        return "Tripulante aterrisado";
    }

    @Override
    public String inativar(Tripulante tripulante) {
        return "Tripulante inativado";
    }
}
