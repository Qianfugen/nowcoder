package day1;

/**
 * 第一行输入一个有字母和数字以及空格组成的字符串，第二行输入一个字符
 */

import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] chars = str.toCharArray();
        char target = scanner.next().charAt(0);
        int num = 0;
        for (int i = 0; i < chars.length; i++) {
            if ((chars[i] == target) || (chars[i] == target - 32) || (chars[i] == target + 32)) {
                num++;
            }
        }
        System.out.println(num);
    }
}
