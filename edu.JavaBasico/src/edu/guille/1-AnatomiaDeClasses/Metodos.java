public class Metodos {
  // Sintaxe:
  // TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)

  // Exemplos:
  public static int somar (int numeroUm, int numero2) {
    return numeroUm + numero2;
  }

  public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
  }

  public static void main (String [] args) {
    String primeiroNome = "Guilherme";
    String segundoNome = "Pinho";
    int um = 1;
    int dois = 2;
    String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
    System.out.print(nomeCompleto);
    System.out.print(somar (um, dois));
  }

}
