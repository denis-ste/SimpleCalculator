import java.util.List;

public class Calculator {
    public static void work(List<Integer> numbers){
        InfoProgram.infoMenuProgram();
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
