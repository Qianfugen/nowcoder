package day4;
/**
 * 连续输入字符串(输出次数为N,字符串长度小于100)，请按长度为8拆分每个字符串后输出到新的字符串数组，
 *
 * 长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
 *
 * 首先输入一个整数，为要输入的字符串个数。
 *
 * 例如：
 *
 * 输入：2
 *
 *       abc
 *
 *       12345789
 *
 * 输出：abc00000
 *
 *       12345678
 *
 *       90000000
 */

import java.util.Scanner;

public class SplitString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        while (scanner.hasNext()) {
            int count = scanner.nextInt();
            for (int i = 0; i < count; i++) {
                String s = scanner.next();

                int groups = s.length() / 8;
                if (s.length() % 8 == 0) {
                    for (int j = 0; j < s.length(); j += 8) {
                        String str = s.substring(j, j + 8);
                        sb.append(str + "\n");
                    }
                }
                if (s.length() % 8 > 0) {
                    for (int j = 0; j + 8 < s.length(); j += 8) {
                        String str = s.substring(j, j + 8);
                        sb.append(str + "\n");
                    }
                    sb.append(s.substring(groups * 8, s.length()));
                    for (int k = 0; k < (groups + 1) * 8 - s.length(); k++) {
                        sb.append("0");
                    }
                    sb.append("\n");
                }
            }
            String[] str = sb.toString().split("\n");
            for (String s : str) {
                System.out.println(s);
            }
            sb.setLength(0);
        }

    }
}
