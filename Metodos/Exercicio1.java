package Metodos;

import java.time.LocalTime;
import java.util.Scanner;

public class Exercicio1 {
  
  public static void main(String[] args) {
    int hora = horas();
    
    if (hora > 18) {
      System.out.println("Boa noite!");
    } else if (hora > 12) {
      System.out.println("Boa tarde!");
    } else {
      System.out.println("Bom dia!");
    }

    Scanner scan = new Scanner(System.in);
    System.out.println("Numero 1:");
    int numero1 = scan.nextInt();
    System.out.println("Numero 2:");
    int numero2 = scan.nextInt();

    System.out.println("Soma: " + somar(numero1, numero2));
    System.out.println("Subtração: " + subtrair(numero1, numero2));
    System.out.println("Multiplicação: " + multiplicar(numero1, numero2));
    System.out.println("Divisão: " + dividir(numero1, numero2));

    System.out.println("Digite o valor do empréstimo");
    int valor = scan.nextInt();
    System.out.println("Digite a quantidade de parcelas");
    int parcelas = scan.nextInt();
    double valorParcela = valorEmprestimo(valor, parcelas);
    System.out.printf("Valor cada parcela: R$%.2f", valorParcela);
    System.out.printf("\nValor final do emprestímo: R$%.2f", valorParcela * parcelas);

    scan.close();
  }

  public static double valorEmprestimo(int valor, int parcelas) {
    double taxaAoMes;
    if (parcelas > 60) {
      taxaAoMes = 0.02;
    } else if (parcelas > 30) {
      taxaAoMes = 0.01;
    } else {
      taxaAoMes = 0.005;
    }
    double cadaParcelaSemJuros = valor / parcelas;
    double juros = cadaParcelaSemJuros * taxaAoMes;
    double parcelaComJuros = cadaParcelaSemJuros + juros;
    return parcelaComJuros;
  }

  public static int horas() {
    LocalTime time = LocalTime.now();
    return time.getHour();
  }

  public static int somar(int valor1, int valor2) {
    return valor1 + valor2;
  }

  public static int subtrair(int valor1, int valor2) {
    return valor1 - valor2;
  }

  public static int multiplicar(int valor1, int valor2) {
    return valor1 * valor2;
  }

  public static int dividir(int valor1, int valor2) {
    return valor1 / valor2;
  }
}
