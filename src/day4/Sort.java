package day4;

import java.util.Scanner;

/**
 * 编写一个程序，将输入字符串中的字符按如下规则排序。
 * <p>
 * 规则 1 ：英文字母从 A 到 Z 排列，不区分大小写。
 * <p>
 * 如，输入： Type 输出： epTy
 * <p>
 * 规则 2 ：同一个英文字母的大小写同时存在时，按照输入顺序排列。
 * <p>
 * 如，输入： BabA 输出： aABb
 * <p>
 * 规则 3 ：非英文字母的其它字符保持原来的位置。
 * <p>
 * <p>
 * 如，输入： By?e 输出： Be?y
 */
public class Sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = null;
        while ((str = scanner.nextLine()) != null) {
            StringBuffer sb = new StringBuffer();
            char[] cs = str.toCharArray();
            for (int i = 0; i < 26; i++) {
                char c = (char) (i + 'A');
                for (int j = 0; j < cs.length; j++) {
                    if (cs[j] == c || cs[j] == c + 32) {
                        sb.append(cs[j]);
                    }
                }
            }
            for (int i = 0; i < cs.length; i++) {
                if ((cs[i] >= 'a' && cs[i] <= 'z') || (cs[i] >= 'A' && cs[i] <= 'Z')) {
                    continue;
                }
                sb.insert(i, cs[i]);
            }
            System.out.println(sb.toString());
        }
    }
}
