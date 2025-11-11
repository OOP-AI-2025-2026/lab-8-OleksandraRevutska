package ua.opnu;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // 🔹 ЗАВДАННЯ 1 — MyOptional
        System.out.println("=== Завдання 1 ===");
        MyOptional<String> middleName = new MyOptional<>();
        System.out.println(middleName); // MyOptional[empty]
        System.out.println("isPresent: " + middleName.isPresent());
        System.out.println("orElse: " + middleName.orElse("немає"));

        MyOptional<String> username = new MyOptional<>("admin");
        System.out.println(username); // MyOptional[value=admin]
        System.out.println("isPresent: " + username.isPresent());
        System.out.println("get(): " + username.get());
        System.out.println("orElse: " + username.orElse("guest"));

        try {
            String test = middleName.get();
        } catch (IllegalStateException ex) {
            System.out.println("Очікуваний виняток: " + ex.getMessage());
        }

        try {
            MyOptional<String> broken = new MyOptional<>(null);
        } catch (IllegalArgumentException ex) {
            System.out.println("Правильно не дозволив null: " + ex.getMessage());
        }

        // 🔹 ЗАВДАННЯ 2 — BookData (Comparable)
        System.out.println("\n=== Завдання 2 ===");
        BookData b1 = new BookData("Java Basics", "John", 100, 450); // 4.5
        BookData b2 = new BookData("C++ Pro", "Mike", 50, 250);       // 5.0
        BookData b3 = new BookData("Python Guide", "Ann", 200, 600);  // 3.0

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        System.out.println("\nПорівняння:");
        System.out.println("b1 vs b2: " + b1.compareTo(b2));
        System.out.println("b2 vs b3: " + b2.compareTo(b3));
        System.out.println("b1 vs b3: " + b1.compareTo(b3));

        // 🔹 ЗАВДАННЯ 3 — узагальнений метод printArray()
        System.out.println("\n=== Завдання 3 ===");
        Printer myPrinter = new Printer();
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);

        // 🔹 ЗАВДАННЯ 4 — узагальнений filter()
        System.out.println("\n=== Завдання 4 ===");
        String[] names = {"Anna", "Bob", "Alexandra"};
        String[] filtered = FilterUtil.filter(names, n -> n.length() > 3);
        System.out.println("Відфільтровані імена: " + Arrays.toString(filtered));

        // 🔹 ЗАВДАННЯ 5 — узагальнений contains()
        System.out.println("\n=== Завдання 5 ===");
        String[] fruits = {"apple", "banana", "cherry"};
        System.out.println("Містить 'banana'? " + ArrayUtils.contains(fruits, "banana"));
        System.out.println("Містить 'grape'? " + ArrayUtils.contains(fruits, "grape"));

        // 🔹 ЗАВДАННЯ 6 — узагальнені кортежі
        System.out.println("\n=== Завдання 6 ===");
        GenericTwoTuple<String, Integer> person = new GenericTwoTuple<>("Oleksandra", 19);
        System.out.println("Кортеж 2 елементи: " + person);

        GenericThreeTuple<String, Integer, Double> student = new GenericThreeTuple<>("David", 20, 4.8);
        System.out.println("Кортеж 3 елементи: " + student);

        System.out.println("\n=== Кінець тестування ===");
    }
}


