package Observer;

import org.junit.jupiter.api.Test;

class VooTest {

    @Test
    void deveNotificarUmVoo() {
        Aeroporto aeroporto = new Aeroporto(1, "Aeroporto De Brasilia", "Brasilia");
        Voo voo = new Voo(1, "Sao Paulo", "Brasilia");
        voo.marcarVoo(aeroporto);
        aeroporto.mudancaNoPouso();
        assertEquals("Aeroporto{id=1, nome=Aeroporto De Brasilia, local=Brasilia}", voo.getUltimaNotificacao());
    }

    
}
