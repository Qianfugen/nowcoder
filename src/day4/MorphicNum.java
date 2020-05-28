package day4;
/**
 * 自守数是指一个数的平方的尾数等于该数自身的自然数。例如：25^2 = 625，76^2 = 5776，9376^2 = 87909376。请求出n以内的自守数的个数
 * 0 也算
 */

import java.util.Scanner;

public class MorphicNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            System.out.println(CalcAutomorphicNumbers(n));
        }
    }

    public static int CalcAutomorphicNumbers(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int result = (int) Math.pow(i, 2);
            if (result % 10 == 1 || result % 10 == 5 || result % 10 == 6) {
                int x = i;
                int y = 0;
                int z = 0;

                while (x != 0) {
                    x /= 10;
                    y++;
                }

                z = (int) (result % Math.pow(10, y));
                if (z == i) {
                    count++;
                }
            }
        }
        count++;
        return count;
    }
}
