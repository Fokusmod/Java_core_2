package Lesson1;

public class Classwork1 {

    public static void main(String[] args) {
        WeekDay day = WeekDay.FRIDAY;
        System.out.println(day.getDayNumber());
        System.out.println(day.getRussianName());
        System.out.println(day.ordinal());
        day = WeekDay.THURSDAY;

        Operator op = Operator.SUM;
        System.out.println(op.operation(55,22));
        op = Operator.MUL;
        System.out.println(op.operation(5,25));


    }

    enum Operator {
        SUM {
            public int operation(int x, int y) {return x + y;}
        },
        MUL {
            public int operation(int x, int y) {return x * y;}
        };

        public abstract int operation(int x, int y);
    }

    enum WeekDay {
        MONDAY(1, "Понедельник"),
        TUESDAY(2,"Вторник"),
        WEDNESDAY(3,"Среда"),
        THURSDAY(4,"Черверг"),
        FRIDAY(5,"Пятница"),
        SATURDAY(6,"Суббота"),
        SUNDAY(7,"Воскресение");

        private int dayNumber;
        private String russianName;


        WeekDay(int dayNumber, String russianName) {
            this.dayNumber = dayNumber;
            this.russianName = russianName;
        }

        public int getDayNumber() {
            return dayNumber;
        }

        public String getRussianName() {
            return russianName;
        }
    }
}
