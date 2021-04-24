package Homework1;

public class Robot implements Members {
    private String name;
    private final int limitRun = 1500;
    private final int limitJump = 250;

    public Robot(String name) {
        this.name = name;
    }

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
