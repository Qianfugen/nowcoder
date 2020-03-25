package day2;

/**
 * 给定n个字符串，请对n个字符串按照字典序排列。
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OrderByDist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        List<String> list = new ArrayList<>();
        while (count > 0) {
            String s = scanner.next();
            list.add(s);
            count--;
        }

        Collections.sort(list);

        for (String str : list) {
            System.out.println(str);
        }
    }
}
