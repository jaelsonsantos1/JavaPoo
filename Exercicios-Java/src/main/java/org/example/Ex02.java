package org.example;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        // Escreva um programa que leia um número e determine se ele é par ou ímpar.

        Scanner input = new Scanner(System.in);

        System.out.printf("Informe um número: ");
        int num = input.nextInt();

        if(num%2==0){
            System.out.println("O número informado é par!");
        } else {
            System.out.println("O número informado é ímpar!");
        }
    }
}