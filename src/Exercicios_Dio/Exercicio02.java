package Exercicios_Dio;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        if (scanner.hasNextDouble()) {
            double celsius = scanner.nextDouble();
            if (celsius < -273.15) {
                System.out.println("Entrada invalida");
            } else {
                double fahrenheit = (celsius * 1.8) + 32;
                System.out.printf("%.1f%n", fahrenheit);
            }
        } else {
            System.out.println("Entrada invalida");
        }
        scanner.close();
    }
}
