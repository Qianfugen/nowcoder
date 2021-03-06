package day4;
/**
 * •计算一个数字的立方根，不使用库函数
 *
 * 详细描述：
 *
 * •接口说明
 *
 * 原型：
 *
 * public static double getCubeRoot(double input)
 *
 * 输入:double 待求解参数
 *
 * 返回值:double  输入参数的立方根，保留一位小数
 */

import java.util.Scanner;

public class CubeRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double input = scanner.nextDouble();
        double result = getCubeRoot(input);
        System.out.printf("%.1f\n", result);
    }

    public static double getCubeRoot(double input) {
        double min = 0;
        double max = input;
        double mid = 0;

        while (max - min > 0.001) {
            mid = (min + max) / 2.0;
            if (mid * mid * mid > input) {
                max = mid;
            } else if (mid * mid * mid < input) {
                min = mid;
            } else {
                return mid;
            }
        }
        return max;
    }
}
