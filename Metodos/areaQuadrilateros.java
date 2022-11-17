package Metodos;

public class areaQuadrilateros {
  
  public static double calcular(double lado) {
    return lado * lado;
  }

  public static double calcular(double altura, double comprimento) {
    return altura * comprimento;
  }

  public static double calcular(double baseMaior, double baseMenor, double altura) {
    return ((baseMaior + baseMenor) * altura) / 2;
  }

  public static double calcular(float diag1, float diag2) {
    return (diag1 * diag2) / 2;
  }
}
