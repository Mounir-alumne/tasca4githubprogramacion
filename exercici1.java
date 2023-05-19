package com.mycompany.tasca2prgramacion;
import java.util.Scanner;
public class javaapplication2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        do {
            System.out.print("Introdueix un número entre 1 i 10: ");
            numero = scanner.nextInt();
        } while (numero < 1 || numero > 10);

        System.out.println("Taula de multiplicar del número " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            int resultat = numero * i;
            System.out.println(numero + " x " + i + " = " + resultat);
        }
    }
}
