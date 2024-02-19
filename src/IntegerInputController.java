import java.util.ArrayList;
import java.util.List;

public class IntegerInputController {
    public static List<Integer> input (int amount) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < amount; i++) {
            IntegerInputHandler.setNumber();
            numbers.add(IntegerInputHandler.getNumber());
        }
        return numbers;
    }
}
