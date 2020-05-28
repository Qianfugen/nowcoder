package day4;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SortByFlag {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int N = in.nextInt();
            Integer[] a = new Integer[N];
            for (int i = 0; i < N; i++) {
                a[i] = in.nextInt();
            }
            int flag = in.nextInt();
            sortIntegerArray(a, flag);

        }
        in.close();


    }

    public static void sortIntegerArray(Integer[] pIntegerArray, int iSortFlag) {
        if (iSortFlag == 0) {
            Arrays.sort(pIntegerArray);
        } else {
            Arrays.sort(pIntegerArray, new MyComparator());
        }
    }
}

class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1.intValue() < o2.intValue()) {
            return 1;
        } else if (o1.intValue() == o2.intValue()) {
            return 0;
        } else {
            return -1;
        }
    }
}
