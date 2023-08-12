package org.example;

import java.util.Calendar;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Ex01 {
    public static void main(String[] args) {
        //Escreva um programa que calcule a idade do usuário.
        // Para isso, o programa deve ler o ano de nascimento, o ano atual e depois mostrar a idade.
        // Obs.: O ano deve ser informado no formato AAAA (ex.: 1980).

        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);

        Scanner input = new Scanner(System.in);

        System.out.printf("Informe o ano de seu nascimento: ");
        int anoNasc = input.nextInt();

        int idade = anoAtual - anoNasc;

        System.out.printf("\nVocê tem %d anos.", idade);
    }
}