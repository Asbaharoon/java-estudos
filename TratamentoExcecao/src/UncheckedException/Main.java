package UncheckedException;

import javax.swing.*;

public class Main {
    // Fazendo a divisão de dois valores inteiros
    public static void main(String[] args) {
        boolean continueLooping = true;
        do {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");
            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLooping = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida, informe um número! " + e.getMessage());
              throw new RuntimeException(e);
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Impossível dividir por zero! " + e.getMessage());
            }
            finally {
                System.out.println("Chegou no finally!");
            }
        } while (continueLooping);

        System.out.println("Chegou até aqui...");
    }

    static int dividir(int a, int b) { return a / b; }
}