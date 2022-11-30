package ExceptionPersonalizada2;

import javax.swing.*;

public class ExceptionPersonalizada2 {
    public static void main(String[] args) {
        int[] numerador = {4, 5, 8, 10};
        int[] denominador = {2, 4, 0, 2, 8};

        for (int i = 0; i < denominador.length; i += 1) {
            try {
                if (numerador[i] %2 != 0) throw new DivisaoNaoExataException("Divisão não exata", numerador[i], denominador[i]);

                int resultado = numerador[i] / denominador[i];

                System.out.println(resultado);
                System.out.println("O programa continua");
            } catch(DivisaoNaoExataException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }
}

class DivisaoNaoExataException extends Exception {
    private int numerador;
    private int denominador;

    public DivisaoNaoExataException(String message, int numerador, int denominador) {
        super(message);
        this.numerador = numerador;
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return "{" +
                "numerador=" + numerador +
                ", denominador=" + denominador +
                '}';
    }
}
