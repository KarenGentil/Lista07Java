package lista07;

import java.util.Scanner;

public class NumerosInteiros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int soma = 0;
        for (int i = 1; i <= 100; i++){
            soma += i;
        }
        System.out.println("Soma dos 100 primeiros numeros;"+soma);
    }
}
