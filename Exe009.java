package ListaExe;

import java.util.Scanner;

public class Exe009 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int leia, soma = 0, prod = 0;
        System.out.println("Digite um numero positivo, e para encerrar, digite 0");
        leia = key.nextInt();
        while (leia != 0) {
            if (leia % 2 == 0) {
                soma = soma + leia;
            } else {
                prod = prod * leia;
            }
        }
        System.out.println("A Soma dos numeros pares é: " + soma);
        System.out.println("O Produto dos numeros impares é: " + prod);
    }
}
