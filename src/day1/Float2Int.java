package day1;

/**
 * 写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整。
 */

import java.util.Scanner;

public class Float2Int {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float f = scanner.nextFloat();
        int a = getInt(f);
        System.out.println(a);
    }

    public static int getInt(float f) {
        int a = (int) f;
        if (f - a >= 0.5) {
            return a + 1;
        } else {
            return a;
        }
    }
}
