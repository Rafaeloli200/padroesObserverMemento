/*
Tripulante está em folga, mas disponivel para voos imprevistos
 */
package Memento;


public class TripulanteEstadoInativo implements EstadoDoTripulante {

    private TripulanteEstadoInativo() {};
    private static TripulanteEstadoInativo instance = new TripulanteEstadoInativo();
    public static TripulanteEstadoInativo getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Inativo";
    }

    
    @Override
    public String disponibilizar(Tripulante tripulante) {
        return "Tripulante Disponibilizado";
    }

    @Override
    public String desligar(Tripulante tripulante) {
        return "Tripulante desligado";
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
