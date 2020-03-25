package day3;

/**
 * 他是这么变换的，大家都知道手机上的字母： 1--1， abc--2, def--3, ghi--4, jkl--5, mno--6, pqrs--7, tuv--8 wxyz--9, 0--0,
 * 就这么简单，渊子把密码中出现的小写字母都变成对应的数字，数字和其他的符号都不做变换，

 * 声明：密码中没有空格，而密码中出现的大写字母则变成小写之后往后移一位，如：X，先变成小写，再往后移一位，不就是y了嘛，简单吧。
 * 记住，z往后移是a哦。
 */

import java.util.Scanner;

public class Encrypt {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String pwd=scanner.next();
        char[] arr=new char[pwd.length()];
        for(int i=0;i<pwd.length();i++){
            char c=pwd.charAt(i);
            //1.大写字母则变成小写之后往后移一位
            if(c>='A'&&c<'Z'){
                arr[i]= (char) (c+32+1);
                continue;
            }else if(c=='Z'){
                arr[i]='a';
                continue;
            }
            //2. 数字不变
            if(c>='0'&&c<='9'){
                arr[i]=c;
                continue;
            }
            //3. 1--1， abc--2, def--3, ghi--4, jkl--5, mno--6, pqrs--7, tuv--8 wxyz--9, 0--0
            if(c>='a'&&c<='c'){
                arr[i]='2';
            }else if(c<='f'){
                arr[i]='3';
            }else if(c<='i'){
                arr[i]='4';
            }else if(c<='l'){
                arr[i]='5';
            }else if(c<='o'){
                arr[i]='6';
            }else if(c<='s'){
                arr[i]='7';
            }else if(c<='v'){
                arr[i]='8';
            }else if(c<='z'){
                arr[i]='9';
            }
        }
        String s=new String(arr);
        System.out.println(s);
    }
}
