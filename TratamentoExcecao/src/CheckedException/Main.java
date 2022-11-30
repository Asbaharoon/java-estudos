package CheckedException;

import javax.swing.*;
import java.io.*;

// Imprimir um arquivo no console
public class Main {
    public static void main(String[] args) {
        String nomeDoArquivo = "romances-blake-crouch.txt";
        imprimirArquivoNoConsole(nomeDoArquivo);

        System.out.println("Apesar da exception ou não, o programa continua...");
    }

    static void imprimirArquivoNoConsole(String nomeDoArquivo) throws FileNotFoundException {
        File file = new File(nomeDoArquivo);

        BufferedReader br = new BufferedReader(new FileReader((file.getName())));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bw.write(line);
            bw.newLine();
            line=br.readLine();
        } while(line != null);
        bw.flush();
        br.close();
    }
}
