package pagamento;

public class Main {

    public static void main(String[] args) {
        TerminalLegado terminal = new TerminalLegado();
        MeioPagamento adaptador = new TerminalAdapter(terminal);

        Loja loja = new Loja(adaptador);

        System.out.println(loja.comprar(10.50));
        System.out.println(loja.comprar(19.99));
        System.out.println(loja.comprar(0.99));
    }
}
