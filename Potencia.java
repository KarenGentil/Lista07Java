package lista07;

import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a base: ");
        int base = sc.nextInt();

        System.out.println("Digite a exponent: ");
        int exponent = sc.nextInt();

        int reusltado =1;
        int contagem  = 0;

        while (contagem < exponent) {
            reusltado = reusltado * base;
            contagem++;
        }
        System.out.println(base+"^"+exponent+"="+reusltado);

    }
}
