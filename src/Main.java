import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Prosty kalkulator z możliwościa dodawania, odejmownia, mnożenia, dzielenia");
        System.out.println("Podaj dwie liczby calkowite odzielone spacją: ");

        for (int i=0; i<2; i++) {
            IntegerInputHandler.setNumber();
            numbers.add(IntegerInputHandler.getNumber());
        }

        System.out.println("---Wybierz działanie---");
        System.out.println("Dodawanie:   1 ");
        System.out.println("Odejmowanie: 2 ");
        System.out.println("Mnożenie:    3 ");
        System.out.println("Dzielenie:   4 ");

        IntegerInputHandler.setNumber();

        switch (IntegerInputHandler.getNumber()) {
                case 1 -> {
                    System.out.println("Wybrano dodawnie");
                    System.out.println("Wynik: " +  (numbers.get(0) + numbers.get(1)));
                }
                case 2 -> {
                    System.out.println("Wybrano odejmowanie");
                    System.out.println("Wynik: " +  (numbers.get(0) - numbers.get(1)));

                }
                case 3 -> {
                    System.out.println("Wybrano monożenie");
                    System.out.println("Wynik: " +  (numbers.get(0) * numbers.get(1)));
                }
                case 4 -> {
                    System.out.println("Wybrano dzielenie");
                    System.out.println("Wynik: " +  (numbers.get(0) / numbers.get(1)));
                }
                default -> System.out.println("Nieznana operacja");
        }
    }
}

