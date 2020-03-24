package day1;

/**
 * 功能:输入一个正整数，按照从小到大的顺序输出它的所有质因子（如180的质因子为2 2 3 3 5 ）
 *
 * 最后一个数后面也要有空格
 */

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long ulDataInput = scanner.nextLong();
        int num = 2;
        String s = getResult(ulDataInput);
        System.out.println(s);
    }

    public static String getResult(long ulDataInput) {
        String str = "";
        int num = 2;
        while (true) {
            if (ulDataInput == 1) {
                break;
            } else {
                if (ulDataInput % num == 0) {
                    str = str + num + " ";
                    ulDataInput /= num;
                } else {
                    num++;
                }
            }
        }
        return str;
    }
}
