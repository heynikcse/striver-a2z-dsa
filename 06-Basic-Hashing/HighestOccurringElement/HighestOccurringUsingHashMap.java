/*
Given an array nums of n integers, find the most frequent element in it i.e.,
the element that occurs the maximum number of times.
If there are multiple elements that appear a maximum number of times,
find the smallest of them.
 */

//By using number HashMap.

package HighestOccurringElement;
import java.util.*;

public class HighestOccurringUsingHashMap {

    static int mostFrequentElement(int[] nums){

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int x : nums) {
            map.put(x, map.getOrDefault(x, 0)+1);
        }

        int maxFrequency = 0 ;
        int answer = Integer.MAX_VALUE ;

        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {

            int element = entry.getKey();
            int frequency = entry.getValue();

            if ( frequency > maxFrequency){
                maxFrequency = frequency;
                answer = element ;
            } else if ( frequency == maxFrequency && element < answer) {
                answer = element ;
            }
        }
        return answer ;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the element of array : ");
        for(int i = 0 ; i < n ; i++){
            array[i] = sc.nextInt();
        }

        System.out.println(mostFrequentElement(array));
    }
}
