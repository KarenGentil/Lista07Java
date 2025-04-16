package lista07;

import java.util.Scanner;

public class Somatoria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma =0;
        for (int i = 2; i <= 500; i+= 2){
            soma += i;

        }
        System.out.println("Soma dos pares de 1 a 500:"+soma);
    }
}
