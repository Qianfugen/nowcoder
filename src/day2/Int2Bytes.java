package day2;

/**
 * 输入一个int型的正整数，计算出该int型数据在内存中存储时1的个数。
 */

import java.util.Scanner;

public class Int2Bytes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = 0;
        while (num > 0) {
            if (num % 2 == 1) {
                count++;
            }
            num /= 2;
        }
        System.out.println(count);
    }
}
