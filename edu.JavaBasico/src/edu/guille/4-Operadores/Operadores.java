public class Operadores {
  // Símbolos especiais com significado próprio para a linguagem

  // = atribuição / reatribuição

  // == igual
  // + adição
  // - subtração
  // * multiplicação
  // / divisão
  // % módulo

  public class Date {

  };

  String nome = "GLEYSON";
  int idade = 22;
  double peso = 68.5;
  char sexo = 'M';
  boolean doadorOrgao = false;
  Date dataNascimento = new Date();

  // Operadores Aritméticos
  double soma = 10.5 + 15.7;
  int subtração = 113 - 25;
  int multiplicacao = 20 * 7;
  int divisao = 15 / 3;
  int modulo = 18 % 3;
  double resultado = (10 * 7) + (20 / 4);

  // Operadores Unários
  // + números são positivos sem esse operador explícito
  // - nega um número ou expressão aritmética
  // ++ operador de incremento de valor
  // -- operador de decremento de valor
  // ! operador lógicode negação booleana

  // Operador Ternário
  // <Expressão condicional> ? <caso true> : <caso false>

  // Operadores Relacionais
  // == igual
  // != diferente
  // > maior
  // >= maior ou igual
  // < menor
  // <= menor ou igual

  // Operadores lógicos
  // && operador lógico "E"
  // || operador lógico "OU"

  public static void main(String[] args) {
    boolean var = true;
    int numero = +5;
    numero ++;

    int a = 6;
    int b = 5;

    String resultado = a == b ? "é sim" : "é não";
    
    System.out.println(resultado);

    System.out.println(-numero);
    System.out.println(++ numero);
    System.out.println(-- numero);
    System.out.println(!var);

    boolean cond1 = true;
    boolean cond2 = false;

    if (cond1 && ( 7 > 4)) {
      System.out.println("ambas true");
    }
    if (cond1 || cond2) {
      System.out.println("uma delas true");
    }
  }

}
