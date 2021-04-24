package Homework1;

public interface Members {
    String getName();
    int getLimitRun();
    int getLimitJump();


    default boolean run(int length) {
        if (length <= getLimitRun()) {
            System.out.println("Участник " + getName() + " преодолел отрезок в " + length + " метров");
            return true;
        } else {
            System.out.println("Участник " + getName() + " не смог преодолеть дистанцию. Он дисквалифицирован.");
            return false;
        }
    }

    default boolean jump(int height) {
        if (height <= getLimitJump()) {
            System.out.println("Участник " + getName() + " перепрыгнул препятствие в " + height + " метров");
            return true;
        } else {
            System.out.println("Участник " + getName() + " не смог перепрыгнуть. Он дисквалифицирован.");
            return false;
        }
    }
    default boolean overcome(Barier o) {
        if (o.getLength() > 0) return run(o.getLength());
        else return jump(o.getHeight());
    }



}
