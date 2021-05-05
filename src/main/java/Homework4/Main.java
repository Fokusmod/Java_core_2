package Homework4;

import java.util.Arrays;

public class Main extends Thread {


    static final int SIZE = 10000000;
    static final int H = SIZE / 2;

    public static void main(String[] args) {

        float[] arr = new float[SIZE];
        float[] arr2 = new float[SIZE];

        methodOne(arr);
        methodTwo(arr2);

        System.out.println("Результат сравнения массивов: " + Arrays.equals(arr,arr2));
    }

    public static void methodOne(float[] array) {
        Arrays.fill(array, 1);
        long a = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            array[i] = (float) (array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("Первый метод закончил работу  " + Thread.currentThread().getName());
        System.out.println(System.currentTimeMillis() - a);
    }

    public static synchronized void methodTwo(float[] array) {
        Arrays.fill(array, 1);

        long a = System.currentTimeMillis();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                float[] a = new float[H];
                System.arraycopy(array, 0, a, 0, H);

                 for (int i = 0; i < a.length; i++) {
                    a[i] = (float) (a[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }

                System.arraycopy(a, 0, array, 0, H);
                System.out.println("Первый готов " + Thread.currentThread().getName());

            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                float[] b = new float[H];
                System.arraycopy(array, H, b, 0, H);
                for (int i = 0; i < b.length; i++) {

                    b[i] = (float) (b[i] * Math.sin(0.2f + (i + H)/ 5) * Math.cos(0.2f + (i + H)/ 5) * Math.cos(0.4f + (i + H)/ 2));
                }

                System.arraycopy(b, 0, array, H, H);
                System.out.println("Второй готов " + Thread.currentThread().getName());
            }
        });

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Второй метод закончил работу");
        System.out.println(System.currentTimeMillis() - a);
    }
}

