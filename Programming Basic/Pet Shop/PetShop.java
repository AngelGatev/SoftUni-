package PbJavaNovember.src.FirstStepsInCoding.Lab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        double sum = a * 2.50 + b * 4.00;

        System.out.println(sum + " lv.");
    }
}
