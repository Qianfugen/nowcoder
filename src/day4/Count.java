package day4;
/**
 * 如果统计的个数相同，则按照ASCII码由小到大排序输出 。如果有其他字符，则对这些字符不用进行统计。
 *
 * 实现以下接口：
 * 输入一个字符串，对字符中的各个英文字符，数字，空格进行统计（可反复调用）
 * 按照统计个数由多到少输出统计结果，如果统计的个数相同，则按照ASII码由小到大排序输出
 * 清空目前的统计结果，重新统计
 * 调用者会保证：
 * 输入的字符串以‘\0’结尾。
 */

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.next();
            System.out.println(fun(str));
        }

    }

    public static String fun(String s) {
        char[] cs = s.toCharArray();
        int[] num = new int[128];
        for (char c : cs) {
            int i = (int) c;
            num[i]++;
        }

        int max = 0;
        for (int i = 0; i < num.length; i++) {
            if (max < num[i]) {
                max = num[i];
            }
        }

        StringBuffer sb = new StringBuffer();

        while (max != 0) {
            for (int i = 0; i < num.length; i++) {
                if (max == num[i]) {
                    sb.append((char) i);
                }
            }
            max--;
        }

        return sb.toString();
    }

}
