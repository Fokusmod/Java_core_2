package Lesson1;

public class InterfacesExample {
    static int a = 10;

    String color;
    public static void main(String[] args) {
//        Flyable[] flyables = {
//                new Duck(),
//                new Plane(),
//                new Duck(),
//                new Flyable() {
//                    @Override
//                    public void fly() {
//                        System.out.println("Anonymous flying");
//                    }
//                }
//        };
//
//        for (Flyable flyable : flyables) {
//            flyable.fly();
//            flyable.land();
////            System.out.println(flyable instanceof Duck);
////            System.out.println(flyable instanceof Flyable);
//        }
//
//        Flyable.doStatic();
//
//        sayMyName("John");
        func(new Interface() {
            @Override
            public void doSomething() {
                System.out.println("From anonymous");
            }
        });

        func(() -> System.out.println("Hello from lyambda!"));


    }

    static void func(Interface i) {
        i.doSomething();
    }

    static void sayMyName (String name, FunInt i) {
//        InterfacesExample ie = new InterfacesExample();
//        ie.color = "red";
//        System.out.println(ie.color);
//        System.out.println("Hello " + name + " " + a);
        i.sayMyName(name);
    }
}
