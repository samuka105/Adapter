package pagamento;

public class TerminalAdapter implements MeioPagamento {

    private TerminalLegado terminal;

    public TerminalAdapter(TerminalLegado terminal) {
        this.terminal = terminal;
    }

    public String pagar(double valorReais) {
        long valorCentavos = Math.round(valorReais * 100);
        return terminal.processar(valorCentavos);
    }
}
