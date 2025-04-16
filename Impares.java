package lista07;

import java.util.Scanner;

public class Impares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int numero = 0; numero <= 20; numero++) {
        if (numero % 2 == 0) {
        System.out.println(numero);}
        }
    }

}
