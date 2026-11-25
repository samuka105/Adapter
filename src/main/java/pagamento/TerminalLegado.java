package pagamento;

public class TerminalLegado {

    public String processar(long valorCentavos) {
        return "Transação aprovada: " + valorCentavos + " centavos";
    }
}
