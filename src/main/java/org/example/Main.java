package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] str = {"A", "A", "B", "B", "B", "Z", "X", "X"};
        Map<String, Integer> res = arrayToMap(str);
        System.out.println(res);
    }

    static <T>Map<T, Integer> arrayToMap(T[] arr) {
        Map<T, Integer> result = new HashMap<>();
        for (T t : arr) {
            if (result.containsKey(t)) {
                Integer count = result.get(t);
                result.put(t, count + 1);
            }
            else
                result.put(t, 1);
        }
        return result;
    }
}