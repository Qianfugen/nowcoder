package day3;

/**
 * 开发一个坐标计算工具， A表示向左移动，D表示向右移动，W表示向上移动，S表示向下移动。从（0,0）点开始移动，
 * 从输入字符串里面读取一些坐标，并将最终输入结果输出到输出文件里面。
 */

import java.util.Scanner;

public class Point {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            int x = 0;
            int y = 0;
            String s = scanner.nextLine();
            String[] tokens = s.split(";");
            for (int i = 0; i < tokens.length; i++) {
                try {
                    Integer step = Integer.valueOf(tokens[i].substring(1, tokens[i].length()));
                    char token = tokens[i].charAt(0);
                    switch (token) {
                        case 'A':
                            x -= step;
                            break;
                        case 'D':
                            x += step;
                            break;
                        case 'S':
                            y -= step;
                            break;
                        case 'W':
                            y += step;
                            break;
                        default:
                            break;
                    }
                } catch (Exception e) {
                    continue;
                }
            }
            System.out.println(x + "," + y);
        }
    }
}
