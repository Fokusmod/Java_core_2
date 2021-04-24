package Lesson1;

public class Car {
    private Wheel wheel;
    private Door door;
    private String name;

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public Door getDoor() {
        return door;
    }

    public String getName() {
        return name;
    }

    void doSomething(){
        this.wheel = new Wheel();
        System.out.println(wheel.radius);  // обращение к внутреннему классу


    }



    class Wheel {
        int radius;

        void doSomething() {
            System.out.println(name); //обращение из внешнего класса
        }

        public int getRadius() {
            return radius;
        }

        public void setRadius(int radius) {
            this.radius = radius;
        }
    }
    class Door {
       int height;

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheel=" + wheel +
                ", door=" + door +
                ", name='" + name + '\'' +
                '}';
    }
}
