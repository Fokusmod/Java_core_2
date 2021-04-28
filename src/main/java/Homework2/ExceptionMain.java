package Homework2;

import java.util.Arrays;
import java.util.SortedMap;

public class ExceptionMain {
    public static void main(String[] args) {

        String[][] strings1 = {{"89", "1", "4", "7"}, {"89", "1", "4", "7"}, {"89", "1", "4", "7"}};
        int[][] ints1 = new int[4][4];
        System.out.println("Пример 1:");

        try {
            TryException(strings1, ints1);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }


        String[][] strings2 = {{"89", "1", "4", "7"}, {"89", "1", "4", "Z"}, {"89", "1", "4", "7"}, {"89", "1", "4", "7"}};
        int[][] ints2 = new int[4][4];
        System.out.println("Пример 2:");

        try {
            TryException(strings2, ints2);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }


        String[][] strings3 = {{"89", "1", "4", "7"}, {"89", "1", "4", "7"}, {"89", "1", "4", "7"}, {"89", "1", "4", "7"}};
        int[][] ints3 = new int[4][4];
        System.out.println("Пример 3");

        try {
            TryException(strings3, ints3);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }


    }


    private static void TryException(String[][] a, int[][] b) throws MyArraySizeException {
        if (a.length != 4) {
            throw new MyArraySizeException("Размер массива должен быть 4х4");
        }
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i].length != 4) {
                throw new MyArrayDataException("Размер массива должен быть 4х4");
            }
            for (int j = 0; j < a.length; j++) {
                try {
                    b[i][j] = Integer.parseInt(a[i][j]);
                    sum = b[i][j] + sum;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Не удалось преобразовать ячейку " + i + " " + j );
                }

            }
        }
        System.out.println("Сумма равна = " + sum);
    }

    private static class MyArraySizeException extends Throwable {
        public MyArraySizeException(String massage) {
            super(massage);
        }
    }

    private static class MyArrayDataException extends RuntimeException {
        public MyArrayDataException(String message) {
            super(message);
        }
    }

}


//1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4, при подаче массива другого
// размера необходимо бросить исключение MyArraySizeException.
//2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать.
// Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
// должно быть брошено исключение MyArrayDataException, с детализацией в какой именно ячейке лежат неверные данные.
//3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и MyArrayDataException,
// и вывести результат расчета.