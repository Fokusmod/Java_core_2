package Lesson1;

import java.io.Serializable;

public class Duck implements Flyable, Cloneable, Serializable {
    @Override
    public void fly() {
        System.out.println("Our duck flying");
    }

    @Override
    public void land() {
        System.out.println("Duck lands");
    }
}
