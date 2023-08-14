package org.example;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        // Escreva um programa que leia dois números e a operação aritmética desejada.
        // 1. Retornar a soma entre dois números;
        // 2. Retornar a subtração entre dois números;
        // 3. Retornar a multiplicação entre dois números;
        // 4. Retornar a divisão entre dois números;

        Scanner input = new Scanner(System.in);

        System.out.printf("Digite o primeiro valor: ");
        int n1 = input.nextInt();

        System.out.printf("Digite o segundo valor: ");
        int n2 = input.nextInt();

        System.out.println("1. Retornar a soma entre dois números;");
        System.out.println("2. Retornar a subtração entre dois números;");
        System.out.println("3. Retornar a multiplicação entre dois números;");
        System.out.println("4. Retornar a divisão entre dois números;");
        System.out.printf("Escolha uma das opções:");
        int op = input.nextInt();

        switch(op) {
            case 1:
                System.out.printf("A soma foi de %d.", n1+n2);
                break;
            case 2:
                System.out.printf("A subtração foi de %d.", n1-n2);
                break;
            case 3:
                System.out.printf("A multiplicação foi de %d.", n1*n2);
                break;
            case 4:
                System.out.printf("A divisão foi de %d.", n1/n2);
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }


    }
}