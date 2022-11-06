public class PalavrasReservadas {
  // 52 palavras reservadas da linguagem

  // Todas são escritas em minúscula, com cor especial na maioria das IDE's

  // Controle de pacotes:
  // import - pacotes ou classes para dentro do código
  // package - especifica a que pacote todas as classes de um arquivo pertencem

  // Modificadores de acesso:
  // public - acesso de qualquer classe
  // private - acesso apenas dentro da classe
  // protected - acesso por classes no mesmo pacote e subclasses

  // Primitivos:
  // boolean
  // byte
  // char
  // double
  // float
  // int
  // short
  // long
  // string
  // void

  // Modificadores de classes, variáveis ou métodos:
  // abstract - classe não instanciada ou método que precisa ser implementado por subclasse não abstrata
  // class - especifica de classes
  // extends - indica a superclasse que a subclasse está estendendo
  // final - impossibilita que a classe seja estendida, que um método seja sobrescrito ou variável seja reatribuída
  // implements - indica as interfaces que uma classe irá implementar
  // interface - especifica uma interface
  // native - indica que um método está escrito em uma linguagem dependente da plataforma, como o C
  // new - instancia um novo objeto, chamando seu construtor
  // static - faz um método ou variável pertencer à classe ao invés de às instâncias
  // strictfp - em frente a método ou classe para indicarque os números de ponto flutuantes seguirão as regras de ponto flutuante em tods as expressões
  // synchronized - indica que u mmétodo só pode ser acessado por uma thread de cada vez
  // transient - impede a serialização de campos
  // volatile - indica que uma variável pode ser alterada durante o uso de threads

  // Controle de fluxo dentro de um bloco de código:
  // break - sai do bloco de código
  // case - executa um bloco dependendo do teste do switch
  // continue - pula a execução do código que viria após essa linha e vai para a próxima passagem do loop
  // default - executa esse bloco caso nenhum dos testes de switch-case seja verdadeiro
  // do - executua um bloco de código uma vez e então realiza um teste em conjunto com o while para determinar se o bloco será executado novamente
  // else - execução alternativa do if falso
  // for - loop de repetição condicional
  // if - usado para teste lógico
  // instanceof - determinar se o objeto é uma instância de determinada classe, superclasse ou interface
  // return - retorna um méotod sem executar qualquer código que venha após essa linha, pode retornar variável
  // switch - indica varíavel a ser comparada na expressão de case
  // while - executa um bloco repetidamente enquanto a condição for verdadeira

  // Tratamento de erros
  // assert - testa uma expressão condicional
  // catch - declara o código que trata uma exceção
  // finally - bloco após try-catch, que executa independente do fluxo
  // throw - usado para passar uma exceção para o método que o chamou
  // throws - indica que o método pode passar uma exceção
  // try - bloco de código que tentará ser executado

  // Variáveis de referência
  // super - refere-se a superclasse imediata
  // this - refere-se a instância atual do objeto

  // Palavras reservadas não utilizadas:
  // const - use public static final
  // goto - não implmentada por ser considerada prejudicial
}
