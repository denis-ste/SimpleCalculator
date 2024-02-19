import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       InfoProgram.infoStartProgram();

        List<Integer> numbers = IntegerInputController.input(2);

       Calculator.work(numbers);
    }
}

