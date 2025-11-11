package ua.opnu;

import java.util.Arrays;
import java.util.function.Predicate;

public class FilterUtil {
    public static <T> T[] filter(T[] input, Predicate<T> predicate) {
        // Створюємо порожній масив того ж типу, що й вхідний
        T[] result = Arrays.copyOf(input, input.length);
        int counter = 0;

        for (T element : input) {
            if (predicate.test(element)) {
                result[counter++] = element;
            }
        }

        // Обрізаємо до потрібної довжини
        return Arrays.copyOf(result, counter);
    }
}

