package lista07;

import java.util.Scanner;

public class SomaMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contagem = 0;
        int soma = 0;

        while (contagem < 10 ){
            System.out.println("Digite um número:");
            int num = sc.nextInt();
            soma += num;
            contagem++;

        }
        double media = soma / 10.0;

        System.out.println("Total da soma "+ soma);
        System.out.println("Average da suma "+ media);
    }
}
