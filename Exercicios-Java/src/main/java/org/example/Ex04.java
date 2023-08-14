package org.example;

import com.sun.jdi.FloatValue;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        // Escreva um programa que leia a altura de 03 pessoas e calcule a média.

        Scanner input = new Scanner(System.in);
        int soma = 0;

        for(int i=0; i<3; i++) {
            System.out.printf("Informe sua altura (cm): ");
            soma += input.nextInt();
        }

        System.out.printf("A média dos números informados são: %s", soma/3);
    }
}