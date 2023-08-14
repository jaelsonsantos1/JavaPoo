package org.example;

import java.util.Scanner;

class Calculate {
    public float calculateTax(float salary) {
        if(salary<=2000) {
            return 0;
        } else if(salary >= 2000.01 && 3.500 <= salary) {
            return (float) (salary*0.15);
        } else if(salary >= 3500.01 && salary <= 5000) {
            return (float) (salary*0.22);
        } else {
            return (float) (salary*0.3);
        }
    }
}

public class Ex07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Calculate cal = new Calculate();

        System.out.printf("Informe seu salário: ");
        float salary = input.nextFloat();

        System.out.printf("O valor do imposto foi de: %.2f", cal.calculateTax(salary));


    }

}