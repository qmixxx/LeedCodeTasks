package org.leetcode.easy;

import java.util.*;
import java.util.Map.Entry;

public class MajorityElement {

    public int majorityElement(int[] nums) {

        Map<Integer, Integer> counts = new HashMap<>();

        for (int i : nums) {
            if (!counts.containsKey(i)) {
                counts.put(i, 1);
            }
            else {
                counts.put(i, counts.get(i) + 1);
            }
        }

        System.out.println(counts);

        int major = Collections.max(counts.values());

        for (Entry<Integer, Integer> entry : counts.entrySet()) {
            if (Objects.equals(major, entry.getValue())) {
                System.out.println(entry.getKey());
                return entry.getKey();
            }
        }

        return 1;

    }


    public void main(String[] args) {
        majorityElement(new int[]{1, 2, 3, 0, 0, 0});
        System.out.println(majorityElement(new int[]{3, 2}));
        System.out.println(majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
        System.out.println(majorityElement(new int[]{2, 1}));
        System.out.println(majorityElement(new int[]{2, 1, 3, 4, 1, 1, 4, 1}));
    }
}