package PbJavaNovember.src.FirstStepsInCoding.Lab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double area = Double.parseDouble(scanner.nextLine());
        double price = area * 7.61;
        double discountPrice = price - price * 0.18;
        double discount = price *  0.18;

        System.out.printf("The final price is: %f lv.%n"+
                "The discount is %f lv.", discountPrice, discount );

    }

    public static class ConcatenateData {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String firstName = scanner.nextLine();
            String lastName = scanner.nextLine();
            int age = Integer.parseInt(scanner.nextLine());
            String town = scanner.nextLine();

            System.out.println("You are " + firstName + " " + lastName + ", a " + age +
                    "-years old person from " + town + "." );

        }
    }

    public static class GreetingByName {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String name = scanner.nextLine();
            System.out.println("Hello, " + name + "!");
        }
    }

    public static class HelloJava {
        public static void main(String[] args) {
            System.out.println("Hello SoftUni!");
        }
    }
}
