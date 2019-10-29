package Lista03;

import java.util.Scanner;

public class Exe005 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int leia = 0, cont = 0, inte = 0;

        while (cont < 10) {
            System.out.println("Digite um numero");
            leia = key.nextInt();
            cont++;
            if (leia >= 10 && leia <= 150) {
                inte++;
            }
        }

        System.out.println("Há " + inte + " numeros entre 10 e 150");
    }
}
