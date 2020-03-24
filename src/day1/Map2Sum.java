package day1;

import java.util.*;

public class Map2Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String count = scanner.nextLine();
        Map<Integer, Integer> map = new HashMap<>();
        List<String> paramList = new ArrayList<>();

        for (int i = 0; i < Integer.valueOf(count); i++) {
            String param = scanner.nextLine();
            paramList.add(param);
        }

        List<Integer> keyList = new ArrayList<>();
        List<Integer> valueList = new ArrayList<>();
        for (int i = 0; i < paramList.size(); i++) {
            String[] paramArr = paramList.get(i).split(" ");
            keyList.add(Integer.valueOf(paramArr[0]));
            valueList.add(Integer.valueOf(paramArr[1]));
        }

        for (int i = 0; i < keyList.size(); i++) {
            if (map.containsKey(keyList.get(i))) {
                map.put(keyList.get(i), map.get(keyList.get(i)) + valueList.get(i));
            } else {
                map.put(keyList.get(i), valueList.get(i));
            }
        }

        List<Integer> list = new ArrayList<>();
        for (Integer key : map.keySet()) {
            list.add(key);
        }

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " " + map.get(list.get(i)));
        }
    }
}
