package day1;

/**
 * 计算字符串最后一个单词的长度，单词以空格隔开。
 */

import java.util.Scanner;

public class LastWordLength {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] str = s.split(" ");
        System.out.println(str[str.length-1].length());
    }
}
