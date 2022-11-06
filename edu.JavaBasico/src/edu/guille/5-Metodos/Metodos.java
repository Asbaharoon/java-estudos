public class Metodos {
  // Todas as >ações< da aplicação são consideradas métodos.
  // Classes são definidas por atributos e métodos.
  // Atributos são as variáveis, de diferentes tipos e valores
  // Métodos correspondem a funções ou sub-rotinas disponíveis dentro das classes

  // Critérios de nomeação de métodos
  // Recomendável - seguido pela comunidade
  // Nomeado como verbo
  // camelCase

  // Exemplos
  // somar (int n1, int n2) {}
  // abrirConexap {}
  // concluirProcessamento () {}
  // findById (int id) {}

  // ATENÇÃO! Não existe conceitos de métodos globais, todos devem ser feitos dentro das classes

  // Qual a proposta principal do método?
  // Qual o tipo de retorno esperado após executar o método?

  // Se não retornar nada, usar chave void

  // Quais parametros necessários?
  // O método possui risco ed apresentar alguma exceção?
  // Qual a visibilidade do método? toda aplicação? somente em mesmo pacotes? herança?

  public double somar (int num1, int num2) {
    return num1 + num2;
  }

  public void imprimir (String texto) {
    System.out.println(texto);
  }

  public double dividir (int dividendo, int divisor) throws Exception {
    return dividendo / dividendo;
  }

  private void metodoPrivado () {

  }

  public static void main(String[] args) {
    
  }

};