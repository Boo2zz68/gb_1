package lesson_3;

public class Lesson_3 {
    public static void main(String[] args) {
        int[] numb = new int[5];
        numb[0] = 1;
        numb[1] = 0;
        numb[2] = 1;
        numb[3] = 0;
        numb[4] = 1;
        for (int i = 0; i < numb.length; i++) {
            if (numb[i] < 1) {
                System.out.println(numb[i] = 1);
            } else if (numb[i] > 0) {
                System.out.println(numb[i] = 0);
            }
        }
        int[] symbol = new int[100];
        for (int i = 0; i < symbol.length; i++) {
            symbol[i] = i + 1;
            System.out.println("symbol[" + i + "] = " + symbol[i]);
        }
        int[] numb_1 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < numb_1.length; i++) {
            if (numb_1[i] < 6) {
                System.out.print(numb_1[i] * 2 + ", ");
            } else if (numb_1[i] >= 6) {
                System.out.print(numb_1[i] + ", ");
            }
        }
        System.out.println();
        numb_2(3, 5);
    }

    public static void numb_2(int len, int initialValue) {
        int[] mas = new int[len];
        for (int i = 0; i < len; i++) {
            mas[i] = initialValue;
            System.out.println(mas[i]);
        }
    }
}