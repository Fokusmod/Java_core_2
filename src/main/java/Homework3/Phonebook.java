package Homework3;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {

    private String name;
    private int number;

    List<String> names = new ArrayList<>();
    List<Integer> numbers = new ArrayList<>();


    public void add(String name, int number) {
        names.add(this.name = name);
        numbers.add(this.number = number);
    }

    public void get(String name) {
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).equals(name)) {
                System.out.println(name + ". Телефон - " + numbers.get(i));
            }
        }
    }
}
