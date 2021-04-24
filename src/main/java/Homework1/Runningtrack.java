package Homework1;

public class Runningtrack implements Barier {
    private final int length;


    public Runningtrack(int length) {
        this.length = length;
    }
    @Override
    public int getLength() {
        return length;
    }

    @Override
    public int getHeight() {
        return 0;
    }
}
