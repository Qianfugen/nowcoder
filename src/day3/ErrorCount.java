package day3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ErrorCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> errorRecord = new LinkedHashMap<>();
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            if ("".equals(s)) {
                break;
            }
            String[] str = s.split(" ");

            String fName = str[0];
            String errorLine = str[1];

            String fileName = fName.substring(fName.lastIndexOf("\\") + 1);

            //长度超过16
            int length = fileName.length();
            if (length > 16) {
                fileName = fileName.substring(length - 16);
            }

            //将错误信息记录到map
            String errorName = fileName + " " + errorLine;
            if (errorRecord.containsKey(errorName)) {
                errorRecord.put(errorName, errorRecord.get(errorName) + 1);
            } else {
                errorRecord.put(errorName, 1);
            }
        }
        //取最后八条记录
        int count = 0;
        for (String key : errorRecord.keySet()) {
            count++;
            if (count > errorRecord.size() - 8) {
                System.out.println(key + " " + errorRecord.get(key));
            }
        }
    }
}
