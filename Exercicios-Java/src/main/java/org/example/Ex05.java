package org.example;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        //  Escreva um programa que leia 02 números e determine qual o maior número digitado.

        Scanner input = new Scanner(System.in);

        System.out.printf("Digite um número: ");
        int n1 = input.nextInt();

        System.out.printf("Digite outro número: ");
        int n2 = input.nextInt();

        if(n1>n2) {
            System.out.printf("%d é maior!", n1);
        } else {
            System.out.printf("%d é maior!", n2);
        }

    }
}