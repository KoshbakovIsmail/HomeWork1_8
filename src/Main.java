import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        test1_3();
        test4();
    }

    public static void test1_3() {
        int[] number = new int[]{1, 2, 3, 4};
        double[] numberArr = new double[]{10.154, 15, 754, 54.410, 154.47};

        System.out.println("           Задача от №1 до №3 ");
        System.out.println("Вывод целочисленного массива с помощю Arrays.toString: ");
        System.out.println(Arrays.toString(number));

        System.out.println("Вывод  массива c циклом for и запятой: ");
        for (int i : number) {
            System.out.print(i);
            if (i < 4) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("Вывод  массива в обратом порядке c циклом for и запятой: ");
        for (int i = number.length - 1; i >= 0; i--) {
            System.out.print(number[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("Вывод массива с плавашей точкой и хроняший дробные числа с помощю Arrays.toString: ");
        System.out.println(Arrays.toString(numberArr));

        System.out.println("Вывод  массива c циклом for и запятой: ");
        for (int i = 0; i < numberArr.length; i++) {
            System.out.print(numberArr[i]);
            if (i < 4) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("Вывод  массива в обратом порядке c циклом for и запятой: ");
        for (int i = numberArr.length - 1; i >= 0; i--) {
            System.out.print(numberArr[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void test4() {
        System.out.println("           Задача №4 Целочисленный массив ");
        int[] number1 = {1, 2, 3};
        System.out.println(Arrays.toString(number1));

        System.out.println("Все нечетные числа в массиве делаем четными: ");
        for (int i = 0; i <= number1.length; i++) {
            if (i % 2 != 0) {
                i++;
            }
            System.out.print(i);
            if (i < 3) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < number1.length; i++) {
            if (number1[i] % 2 != 0) {
                number1[i]++;
            }
            System.out.print(number1[i]);
            if (number1[i] < 3) {
                System.out.print(", ");
            }
        }

    }
}