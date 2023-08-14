package org.example;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        //  Escreva um programa que leia a base e a altura de um retângulo
        //  e retorne a sua área (� � h) e o seu perímetro (2� + 2h).

        Scanner input = new Scanner(System.in);

        System.out.printf("Qual a base: ");
        int b = input.nextInt();

        System.out.printf("Qual a altura: ");
        int h = input.nextInt();

        System.out.printf("A área é de: %d.\n", b*h);
        System.out.printf("O perímetro é %d.", b+h);
    }
}