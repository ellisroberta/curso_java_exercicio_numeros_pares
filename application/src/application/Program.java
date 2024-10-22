package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int qtdpares;

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int[] vect = new int[n];

        System.out.println();
        for (int i=0; i<vect.length; i++) {
            System.out.print("Digite um número: ");
            sc.nextLine();
            int number = sc.nextInt();
            vect[i] = number;
        }
        System.out.println("\nNUMEROS PARES:");

        qtdpares = 0;
        for (int i=0; i<n; i++) {
            if (vect[i] % 2 == 0) {
                System.out.printf("%d  ", vect[i]);
                qtdpares++;
            }
        }

        System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", qtdpares);

        sc.close();
    }
}