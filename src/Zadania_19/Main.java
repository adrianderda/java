package Zadania_19;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        //Zadanie 1
        System.out.println("Hello World!");

        //Zadanie 2
        System.out.println("Adrian " + 25);

        //Zadanie 3
        System.out.println(LocalDate.now());

        //Zadanie 4
        System.out.println("Podaj pierwszą liczbe");
        double x = scanner.nextDouble();
        System.out.println("Podaj drugą liczbe");
        double y = scanner.nextDouble();
        double addResult = calculator.add(x, y);
        double subtractResult = calculator.subtract(x, y);
        double multiplyResult = calculator.multiply(x, y);
        System.out.println("Wynik dodawania: " + addResult);
        System.out.println("Wynik odejmowania: " + subtractResult);
        System.out.println("Wynik mnożenia: " + multiplyResult);

        //Zadanie 5
        System.out.println("Podaj swoją liczbe:");
        int z = scanner.nextInt();
        int squareResult = (int) calculator.multiply(z, z);
        System.out.println("Kwadrat Twojej liczby to: " + squareResult);
        scanner.close();

        //Zadanie 6
        int[] templ = {12, 14, 15, 6, 3, 5, 68, 9, 7, 6, 1, 2, 3};
        for (int i = 0; i < templ.length; i++) {
            System.out.println(templ[i]);
        }


    }
}
