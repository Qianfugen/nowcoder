package day4;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int sum = 0;
            while (n >=1) {
                sum += f(n);
                n--;
            }
            System.out.println(sum);
        }
    }

    public static int f(int n) {
        return 3 * n - 1;
    }
}
