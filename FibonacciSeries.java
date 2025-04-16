package lista07;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contagem =1;
        int primeiro =1;
        int segundo =1;

        System.out.println(primeiro);
        System.out.println(segundo);

        while (contagem < 15){
            int proximo = primeiro + segundo;
            System.out.println(proximo);
            primeiro = segundo;
            segundo = proximo;
            contagem++;
        }



    }
}
