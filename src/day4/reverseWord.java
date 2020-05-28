package day4;
/**
 * 将一个字符串str的内容颠倒过来，并输出。str的长度不超过100个字符。 如：输入“I am a student”，输出“tneduts a ma I”。
 */

import java.util.Scanner;

public class reverseWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word=scanner.nextLine();
        StringBuffer sb=new StringBuffer(word);
        StringBuffer reverse = sb.reverse();
        System.out.println(reverse);
    }
}
