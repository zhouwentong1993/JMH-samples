package test;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(start);
        List<String> list = new ArrayList<>(1000000);

        for (int i = 0; i < 1000000; i++) {
            list.add(String.valueOf(i));
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("999999")) {
                System.out.println(System.currentTimeMillis() - start);
            }
        }
        System.out.println(System.currentTimeMillis() - start);
    }
}
