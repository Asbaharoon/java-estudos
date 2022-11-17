## Sobrecarga

**Conceito**: Capacidade de definir métodos para diferentes contextos, mas preservando seu nome. Mantendo o nome, mas mudando a lista de parâmetros seria possível alterar o comportamento do método.

Basta "redeclarar" o método com outros argumentos.

Exemplo:
- `converterParaInteiro(float f)`;
- `converterParaInteiro(double d)`;
- `converterParaInteiro(String s)`;
- `converterParaInteiro(double d, RoundType rd)`;
- `converterParaInteiro()`;

