package Homework3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework3 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        String[] word = {"Массив", "Класс", "Интерфейс", "Метод", "Массив", "Инкремент", "Пакет", "Список", "Статик", "Инкапсуляция",
                "Наследование", "Абстракция", "Полиморфизм", "Массив", "Метод", "Массив"};
        System.out.println("Заданный массив:" + "\n" + Arrays.toString(word));
        UniqueWords(word, list);
        amountRepeat(word, list);

        Phonebook phonebook = new Phonebook();
        phonebook.add("Алексеев", 123456);
        phonebook.add("Саруханян", 654321);
        phonebook.add("Петров", 222222);
        phonebook.add("Васьков", 333333);
        phonebook.add("Петров", 444444);
        System.out.println();
        phonebook.get("Петров");
        phonebook.get("Саруханян");
    }

    public static List<String> UniqueWords(String[] s, List<String> a) {
        System.out.println("\nСписок уникальных слов:");
        for (int i = 0; i < s.length; i++) {
            if (!a.contains(s[i])) {
                a.add(s[i]);
            }
        }
        System.out.println(a);
        return a;
    }

    public static void amountRepeat(String[] s, List a) {
        System.out.println("\nКолличество повторений:");
        int amount = 0;
        for (int i = 0; i < a.size() - 1; i++) {
            for (int j = 0; j < s.length; j++) {
                if (a.get(i) == s[j]) {
                    amount++;
                }
            }
            System.out.println(a.get(i) + " = " + amount);
            amount = 0;
        }

    }
}
