import java.util.Scanner;

public class IntegerInputHandler {
    private static final Scanner scanner = new Scanner(System.in);
    private static int number;

    public static void setNumber() {
        number = scanner.nextInt();
    }
    public static int getNumber() {
        return number;
    }
}
