package pagamento;

public class Loja {

    private MeioPagamento meioPagamento;

    public Loja(MeioPagamento meioPagamento) {
        this.meioPagamento = meioPagamento;
    }

    public String comprar(double valor) {
        return meioPagamento.pagar(valor);
    }
}
