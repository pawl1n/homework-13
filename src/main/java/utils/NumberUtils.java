package utils;

import java.util.ArrayList;
import java.util.List;

public class NumberUtils {

    private NumberUtils() {}

    public static int getSum(List<Integer> numbers) {
        int sum = 0;

        for (int number: numbers) {
            sum += number;
        }

        return sum;
    }

    public static List<Integer> multiplyOddNumber(List<Integer> numbers) {
        List<Integer> multipliedOddNumbers = new ArrayList<>();

        for (int number: numbers) {
            if (number % 2 != 0) {
                multipliedOddNumbers.add(number * 2);
            }
        }

        return multipliedOddNumbers;
    }
}
