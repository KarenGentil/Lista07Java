package lista07;

import java.util.Scanner;

public class Positivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int maxima = Integer.MIN_VALUE;
        int minima = Integer.MAX_VALUE;

        while (true) {
            System.out.println("Digite um número positivo ");
            numero = sc.nextInt();

            if (numero < 0) break;
            if (numero > maxima) maxima = numero;
            if (numero < minima) minima = numero;

        }

        if (maxima == Integer.MIN_VALUE){
            System.out.println("Nenhum número positivo foi inserido");
        } else {
            System.out.println("maxima" + maxima);
            System.out.println("minima" + minima);

        }

    }
}
