package lista07;

import java.util.Scanner;

public class AreaDaCasa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double areaTotal = 0;
        String nomeComodo;
        String resposta = "sim";

        while (resposta.equalsIgnoreCase("sim")) {
            System.out.println("Digite o nome do cômodo:");
            nomeComodo = sc.nextLine();

            System.out.println("Digite a largura (em metros):");
            double largura = sc.nextDouble();

            System.out.println("Digite o comprimento (em metros):");
            double comprimento = sc.nextDouble();
            sc.nextLine(); // Limpar o buffer

            double areaComodo = largura * comprimento;
            System.out.println("Área do cômodo " + nomeComodo + ": " + areaComodo + " m²");

            areaTotal += areaComodo;

            System.out.print("Deseja adicionar outro cômodo? (sim/nao): ");
            resposta = sc.nextLine();
        }

        System.out.println("Área total da residência: " + areaTotal + " m²");
    }
}
