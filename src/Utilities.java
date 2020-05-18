import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Utilities {
/*
    Napisz program, w którym do listy przechowującej liczby dowolnego typu, wczytasz od użytkownika dowolną ilość liczb dodatnich. Wprowadzanie liczb powinno się zakończyć, gdy użytkownik poda pierwszą liczbę ujemną (liczba ta NIE powinna być dodana do listy). Po zakończeniu wczytywania liczb:

    wyświetl je w kolejności odwrotnej niż były wprowadzone,
    oblicz sumę i ją wyświetl w postaci a+b+c+…=x, gdzie a, b, c to liczby wprowadzone przez użytkownika a x to obliczona suma,
    wyświetl i największą i najmniejszą z wprowadzonych liczb.*/

    public static List<Integer> createNumbersList() {

        List<Integer> numbers = new ArrayList<>();
        String userValue;


        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Type your positive decimal number: ");
            userValue = scanner.nextLine();
            if (StringUtils.isNumeric(userValue)) {
                numbers.add(Integer.parseInt(userValue));
            } else {
                //throw new IllegalArgumentException("Only numbers allowed");
                System.out.println("This is negative value. Your number will not be added to the list");
                break;
            }

        } while (Integer.parseInt(userValue) >= 0);
        return numbers;
    }

    public static void displayReversed(List<Integer> numbers) {
        System.out.print("Reversed order [ ");
        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println("]");
    }

    public static void displaySumOfAll(List<Integer> numbers) {
        String equationBuild = "";
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
            equationBuild += numbers.get(i).toString();
            if (i < (numbers.size() - 1))
                equationBuild += " + ";
            else
                equationBuild += " = ";
        }
        System.out.println("Sum elements [ " + equationBuild + sum + "]");
    }

    public static void displayMaximumElement(List<Integer> numbers) {
        int maximumValue = Collections.max(numbers);
        System.out.println("Maximum element [ " + maximumValue + " ]");
    }

    public static void displayMinimumElement(List<Integer> numbers) {
        int minimumValue = Collections.min(numbers);
        System.out.println("Minimum element [ " + minimumValue + " ]");
    }
}
