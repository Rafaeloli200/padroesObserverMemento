/*
Tripulante está viajando de avião
 */
package Memento;


public class TripulanteEstadoEmVoo implements EstadoDoTripulante {

    private TripulanteEstadoEmVoo() {};
    private static TripulanteEstadoEmVoo instance = new TripulanteEstadoEmVoo();
    public static TripulanteEstadoEmVoo getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "EmVoo";
    }

    
    @Override
    public String disponibilizar(Tripulante tripulante) {
        return "Tripulante Disponibilizado";
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
        return "Tripulante aterrisado";
    }

    @Override
    public String inativar(Tripulante tripulante) {
        return "O processo falhou";
    }
}
