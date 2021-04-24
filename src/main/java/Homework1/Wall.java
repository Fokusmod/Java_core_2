package Homework1;

public class Wall implements Barier{
    private final int height;

    public Wall(int height){
        this.height = height;
    }
    @Override
    public int getLength() {
        return 0;
    }

    public int getHeight() {
        return height;
    }

}

