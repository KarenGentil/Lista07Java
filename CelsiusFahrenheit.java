package lista07;

import java.util.Scanner;

public class CelsiusFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int celsius =10;

        while (celsius <= 100){
            double fahrenheit = (9*celsius + 160) / 5.0;
            System.out.println(celsius+ "ªC = " + fahrenheit + "ºF");
            celsius += 10;
        }
    }
}
