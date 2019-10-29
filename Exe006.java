package Lista03;

import java.util.Scanner;

public class Exe006 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int leia, cont = 0, neg = 0;
        while (cont < 10) {
            System.out.println("Digite um numero");
            leia = key.nextInt();
            cont++;
            if (leia < 0) {
                neg++;
            }
        }
        System.out.println("Há "+neg+" numero(s) negativo(s)");
    }
}
