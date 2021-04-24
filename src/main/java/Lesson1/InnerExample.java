package Lesson1;

public class InnerExample {
    private static int a = 10;

    public static void main(String[] args) {
////        Car car = new Car();
////        car.setName("Lada");
////
////        Car.Wheel wheel = car.new Wheel();
////        Car.Wheel wheel1 = new Car().new Wheel();
//
//        class Local {
//            public void doSomething() {
//                System.out.println(a);
//            }
//        }
//        Local l = new Local();
//        l.doSomething();

        Animal a = new Animal() {
            @Override
            public void doSomething() {
                System.out.println("Hello from anonymous!");
            }
        };
        System.out.println(a.getClass().getName());
//       a.doSomething();
    }

    static class NestedClass {
        //int a;
        String s;

        void doSomething() {
            System.out.println(a);
        }
    }
}

