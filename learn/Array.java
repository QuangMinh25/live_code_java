package learn;

import java.util.*;

public class Array {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");

        for (String str : list) {
            System.out.println(str);
        }
        List<Map<String, Object>> mapList =  new ArrayList<>();
        Map<String, Object> minhParams = new HashMap<>();
        minhParams.put("name", "minh");
        minhParams.put("age", 20);
        mapList.add(minhParams);

        for (Map<String, Object> map : mapList) {
            System.out.println(map);
        }

    }
}
