package Lista03;

import java.util.Scanner;

public class Exe007 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int leia, cont = 0, maior;
        while (cont < 5) {
            System.out.println("Digite sua Idade");
            leia = key.nextInt();
            cont++;
            if (leia < 18) {
                System.out.println("Menor de Idade\n");
            } else {
                System.out.println("Maior de Idade\n");
            }
        }
    }
}
