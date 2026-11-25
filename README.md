# Padrão Adapter

Projeto de uma loja que trabalha com valores em reais, mas precisa usar um
terminal de pagamento legado que só aceita valores em centavos (como um inteiro).
O `TerminalAdapter` faz a ponte entre os dois: ele implementa a interface
`MeioPagamento` que a loja espera e, internamente, converte o valor em reais
para centavos antes de repassar para o terminal antigo. Assim a loja não
precisa conhecer os detalhes do terminal.

## Conteúdo do repositório

- Código-fonte da interface `MeioPagamento`, do `TerminalLegado`, do `TerminalAdapter`, da `Loja` e a `Main` de demonstração
- Casos de teste JUnit verificando a conversão de valores e o uso pela interface
- Diagrama UML do padrão
