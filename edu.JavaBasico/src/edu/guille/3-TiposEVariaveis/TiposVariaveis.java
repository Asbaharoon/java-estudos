public class TiposVariaveis {
  // Variável é identificação de espaço de memória na aplicação
  // <tipo> <nomeVariável> <atribuição>
  int idade;
  int ano = 2021;
  double salario = 1212.300; // Ponto não é divisão de centena!

  // Atenção!!
  int cep = 21070333; // Se começar com 0, o int ignorará! Melhor escolher outro tipo
  String cepOk = "02107033"; // Agora!
  float pi = 3.14F; // Tipos float devem encerrar com F
  long data = 98948616817489519L; // Tipos long devem encerrar com L

  // JAVA É FORTEMENTE TIPADO!!
  // TiposEVariaveis.java

  // short numeroCurto = 1;
  // int numeroNormal = numeroCurto;
  // short numeroCurto2 = numeroNormal; // type mismatch: cannot convert from int to shortJava(16777233)

  // Não é recomendado fazer com frequência, mas posso adotar o casting, para informar ao programa que estou ciente do mismatch e quero a conversão:
    // short numeroCurto = 1;
  // int numeroNormal = numeroCurto;
  // short numeroCurto2 = (short) numeroNormal; // Ok

  // Para tornar constantes, adicionamos o final antes
  final int NUMERO_UM = 1;
}