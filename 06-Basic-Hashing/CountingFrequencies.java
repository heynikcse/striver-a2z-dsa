/*
Given an array nums of size n which may contain duplicate elements.
Rreturn a list of pairs where each pair contains a unique element from the array and its frequency in the array.
You may return the result in any order, but each element must appear exactly once in the output.

output look like : [ [key,value], [key,value], [key,value] ]
 */

import java.util.*;

public class CountingFrequencies {

    static List<List<Integer>> count(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length ; i++) {
            map.put(nums[i] , map.getOrDefault(nums[i], 0)+ 1);
        }

        List<List<Integer>> list = new ArrayList<>();

        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {

            List<Integer> array = new ArrayList<>();

            array.add((entry.getKey()));
            array.add(entry.getValue());

            list.add(array);
        }

        return list ;
    }

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size : ");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the element : ");
        for (int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }

        System.out.println(count(array));
    }
}
