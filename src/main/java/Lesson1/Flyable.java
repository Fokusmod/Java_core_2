package Lesson1;

import java.io.Serializable;

public interface Flyable {
   // String SOME_STRING = "Some String"; //static final

    void fly();

    default void land(){
        System.out.println("Landing");
    }

    static void doStatic() {
        System.out.println("STATIC!!");
    }

    private void doPrivate() {

    }
}
