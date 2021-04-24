package Homework1;

public class Cat implements Members {
    private String name;
    private final int limitRun = 500;
    private final int limitJump = 50;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
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
