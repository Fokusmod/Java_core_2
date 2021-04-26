package Homework1;


public class Main {
    public static void main(String[] args) {

        Members[] members = {
                new Cat("Барсик"),
                new Human("Володя"),
                new Robot("Робокоп"),
                new Human("Паша"),
                new Robot("Терминатор")
        };

        Barier[] bariers = {
                new Runningtrack(150),
                new Wall(50),
                new Wall(100),
                new Wall(200),
                new Runningtrack(500),
                new Runningtrack(1500),
                new Runningtrack(2500)
        };

        for (Members r : members) {
            for (Barier o : bariers) {
//                if (o instanceof Runningtrack) {
//                    r.run(o.getLength());
//                } else {
//                    r.jump(o.getHeight());
//                }
                if (!r.overcome(o)) break;
            }
        }
    }
}




