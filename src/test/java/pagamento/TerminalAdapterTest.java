package pagamento;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TerminalAdapterTest {

    private final MeioPagamento adaptador = new TerminalAdapter(new TerminalLegado());

    @Test
    public void testConverteReaisParaCentavos() {
        assertEquals("Transação aprovada: 1050 centavos", adaptador.pagar(10.50));
    }

    @Test
    public void testArredondaCentavos() {
        assertEquals("Transação aprovada: 1999 centavos", adaptador.pagar(19.99));
    }

    @Test
    public void testValorComUmCentavo() {
        assertEquals("Transação aprovada: 99 centavos", adaptador.pagar(0.99));
    }

    @Test
    public void testValorZero() {
        assertEquals("Transação aprovada: 0 centavos", adaptador.pagar(0.0));
    }

    @Test
    public void testAdaptadorImplementaMeioPagamento() {
        assertTrue(adaptador instanceof MeioPagamento);
    }

    @Test
    public void testClienteUsaPelaInterface() {
        Loja loja = new Loja(adaptador);
        assertEquals("Transação aprovada: 2500 centavos", loja.comprar(25.00));
    }

    @Test
    public void testArredondamentoDeValorQuebrado() {
        assertEquals("Transação aprovada: 10 centavos", adaptador.pagar(0.1));
    }
}
