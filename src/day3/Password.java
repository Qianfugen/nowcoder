package day3;

/**
 * 密码要求:
 * 1.长度超过8位
 * 2.包括大小写字母.数字.其它符号,以上四种至少三种
 * 3.不能有相同长度超2的子串重复
 * 说明:长度超过2的子串
 */

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String pwd = scanner.next();
            boolean flag = verify(pwd);
            if (flag) {
                System.out.println("OK");
            } else {
                System.out.println("NG");
            }
        }
    }

    public static boolean verify(String s) {
        boolean flag=false;
        int[] cla = {0, 0, 0, 0};
        //1.长度超过8位
        if (s.length() > 8) {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c >= '0' && c <= '9') {
                    cla[0] = 1;
                } else if (c >= 'a' && c <= 'z') {
                    cla[1] = 1;
                } else if (c >= 'A' && c <= 'Z') {
                    cla[2] = 1;
                } else {
                    cla[3] = 1;
                }
            }
            //2.包括大小写字母.数字.其它符号,以上四种至少三种
            if (cla[0] + cla[1] + cla[2] + cla[3] >= 3) {
                for (int i = 0; i < s.length() - 3; i++) {
                    String s1 = s.substring(i, i + 3);
                    String s2 = s.substring(i + 3, s.length());
                    if (s2.contains(s1)) {
                        flag=false;
                        break;
                    }else {
                        flag=true;
                    }
                }
            }
        }
        return flag;
    }
}
