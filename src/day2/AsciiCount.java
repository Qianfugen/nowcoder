package day2;

/**
 * 编写一个函数，计算字符串中含有的不同字符的个数。字符在ACSII码范围内(0~127)，换行表示结束符，不算在字符里。不在范围内的不作统计。
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AsciiCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Set set = new HashSet();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 0 && s.charAt(i) <= 127) {
                set.add(s.charAt(i));
            }
        }
        System.out.println(set.size());
    }
}
