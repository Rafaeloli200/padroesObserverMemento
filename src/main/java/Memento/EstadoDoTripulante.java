package Memento;

public interface EstadoDoTripulante {
    
    String getEstado();
    
    String disponibilizar(Tripulante tripulante);
    
    String desligar(Tripulante tripulante);
    
    String decolar(Tripulante tripulante);
    
    String aterrissar(Tripulante tripulante);
    
    String inativar(Tripulante tripulante);
}
