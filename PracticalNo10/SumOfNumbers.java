import java.util.Arrays;
import java.util.List;

public class SumOfNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); // Example list of numbers

        // Calculate the sum using Java 8 Stream API
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();

        System.out.println("Sum of all numbers: " + sum);
    }
}
