package POO.upcastdowncast;

public class RodarAplicacao {
  
  public static void main(String[] args) {

    Funcionario funcionario = new Funcionario();

    Funcionario gerente = new Gerente();
    Funcionario vendedor = new Vendedor();
    Funcionario faxineiro = new Faxineiro();

    Vendedor vendedor2 = (Vendedor) new Funcionario(); //ClassCast - deve ser evitado, apesar de válido
  }
}
