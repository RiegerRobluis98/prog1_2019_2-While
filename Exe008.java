package ListaExe;

import java.util.Scanner;

public class Exe008 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int leia, leia2, soma = 0, cont = 0;
        while (cont < 10) {
            System.out.println("Digite um valor");
            leia = key.nextInt();
            leia2 = leia;
            cont++;
            if (leia < 40) {
                soma = soma + leia;
            }
        }
        System.out.println("Valor Final: " + soma);
    }

}
