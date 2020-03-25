package day1;

/**
 * 输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
 */

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s = scanner.nextLine();
            int length = s.length();
            int[] arr = new int[10];
            for (int i = length - 1; i >= 0; i--) {
                if (arr[s.charAt(i) - 48] == 0) {
                    System.out.print(s.charAt(i) - 48);
                    arr[s.charAt(i) - 48]++;
                }
            }
        }
    }
}
