
package Memento;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TripulanteTest {

    @Test
    void armazenaEstados() {
        Tripulante tripulante = new Tripulante();
        tripulante.setEstado(TripulanteEstadoDisponivel.getInstance());
        tripulante.setEstado(TripulanteEstadoDesligado.getInstance());
        assertEquals(2, tripulante.getEstados().size());
    }

    @Test
    void retornaEstadoInicial() {
        Tripulante tripulante = new Tripulante();
        tripulante.setEstado(TripulanteEstadoDisponivel.getInstance());
        tripulante.setEstado(TripulanteEstadoDesligado.getInstance());
        tripulante.restauraEstado(0);
        assertEquals(TripulanteEstadoDisponivel.getInstance(), tripulante.getEstado());
    }

    @Test
    void retornaEstadoAnterior() {
        Tripulante tripulante = new Tripulante();
        tripulante.setEstado(TripulanteEstadoDisponivel.getInstance());
        tripulante.setEstado(TripulanteEstadoInativo.getInstance());
        tripulante.setEstado(TripulanteEstadoDisponivel.getInstance());
        tripulante.setEstado(TripulanteEstadoDesligado.getInstance());
        tripulante.restauraEstado(2);
        assertEquals(TripulanteEstadoDisponivel.getInstance(), tripulante.getEstado());
    }

    @Test
    void retornaIndiceInvalido() {
        try {
            Tripulante tripulante = new Tripulante();
            tripulante.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("indice invalido", e.getMessage());
        }
    }

}