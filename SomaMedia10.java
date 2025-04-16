package lista07;

import java.util.Scanner;

public class SomaMedia10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = 50;
        int soma = 0;
        int media = 0;

        while (numero <= 70) {
            if (numero % 2 == 0) {
                soma += numero;
                media ++;
            }
            numero++;
        }
        double mediaFinal = (double) soma / media;

        System.out.println("Soma: " + soma);
        System.out.println("Media: " + media);
    }
}
