package hw_02.part_3;

import java.util.Scanner;

public class Investor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть початкову суму вкладу");
        double firstSum = sc.nextDouble();
        System.out.println("Річна ставка");
        double yearsPercent = sc.nextDouble();
        int capital = 12;
        System.out.println("Кількість років");
        int years = sc.nextInt();

        for (int i = 1; i <= years; i++) {
            double capitalSum = firstSum * Math.pow (1+yearsPercent/capital, capital * years);
            double sum = capitalSum - firstSum;
            System.out.println("Накопичена сума після " + i + " років складає: " + capitalSum);
            System.out.println("Нараховано відсотків: " + sum);
        }


    }
}
