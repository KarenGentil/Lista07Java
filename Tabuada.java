package lista07;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 0;

        System.out.println("Digite um número para saber a tabuada ate o 10 ");
        int num = sc.nextInt();

        while (contador < 11) {
            System.out.println(num+"X"+contador+" = "+(num*contador));
            contador++;
        }
    }
}
