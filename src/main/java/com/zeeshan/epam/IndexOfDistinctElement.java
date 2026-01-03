package com.zeeshan.epam;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ZAhmad
 */
public class IndexOfDistinctElement {

    public static void main(String[] args) {
        int num[] = {1, 2, 7, 3, 8, 1, 2, 7, 8};
        Map<Integer, int[]> mapIndex = new HashMap<>();
        for (int i = 0; i < num.length; i++) {
            int value = num[i];
            if (!mapIndex.containsKey(value)) {
                mapIndex.put(value, new int[]{i, i}); // first time same index placed
            } else {
                mapIndex.get(value)[1] = i;
            }
        }

        for (Map.Entry<Integer,int[]> entry: mapIndex.entrySet()) {
            int element = entry.getKey();
            int index[] = entry.getValue();
            System.out.println("Element: " + element + " first index: " + index[0] + " last index: " + index[1]);
        }
    }

}
