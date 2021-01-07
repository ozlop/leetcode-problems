package com.ozlop;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSumBruteForce(int[] nums, int target) {
        return nums;

    }

    public int[] twoSumHashMap(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }

            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");

    }

}
