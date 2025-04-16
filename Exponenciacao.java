package lista07;

import java.util.Scanner;

public class Exponenciacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int expoente = sc.nextInt();
        while (expoente <= 15){
            int resultado = 1;
            int i = 0;

            while (i < expoente){
                resultado *= 3;
                i++;

            }
            System.out.println("3^" +expoente+ "="+ resultado);
            expoente++;
        }

    }
}
