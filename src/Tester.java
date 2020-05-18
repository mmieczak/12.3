import java.util.List;

public class Tester {

    public static void main(String[] args) {
        List<Integer> numbers = Utilities.createNumbersList();
        Utilities.displayReversed(numbers);
        Utilities.displaySumOfAll(numbers);
        Utilities.displayMaximumElement(numbers);
        Utilities.displayMinimumElement(numbers);
    }
}
