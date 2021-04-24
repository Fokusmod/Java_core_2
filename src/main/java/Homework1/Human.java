package Homework1;

public class Human implements Members {
    private String name;
    private final int limitRun = 1000;
    private final int limitJump = 100;

    public String getName() {
        return name;
    }

    public Human(String name) {
        this.name = name;
    }

    @Override
    public int getLimitRun() {
        return limitRun;
    }

    @Override
    public int getLimitJump() {
        return limitJump;
    }

}
