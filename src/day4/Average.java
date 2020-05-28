package day4;
/**
 * 从输入任意个整型数，统计其中的负数个数并求所有非负数的平均值，结果保留一位小数
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList();
        Integer num = 0;
        while (scanner.hasNext()) {
            String[] input = scanner.nextLine().split(" ");
            for (int i = 0; i < input.length; i++) {
                num = Integer.valueOf(input[i]);
                list.add(num);
            }
            int count = 0;
            int sum = 0;
            for (int i = 0; i < list.size(); i++) {
                int temp = list.get(i);
                if (temp < 0) {
                    count++;
                } else {
                    sum += temp;
                }
            }
            System.out.println(count);
            int count2 = list.size() - count;
            if (count2 != 0) {
                System.out.printf("%.1f\n", sum / (double) count2);
            } else {
                System.out.println(0.0);
            }
        }
    }
}
