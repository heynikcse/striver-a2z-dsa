/*
Given an array nums of n integers, find the most frequent element in it i.e.,
the element that occurs the maximum number of times.
If there are multiple elements that appear a maximum number of times,
find the smallest of them.
 */

//By using number Hashing -> Array Hashing

package HighestOccurringElement;
import java.util.*;

public class HighestOccurringUsingArray {

    static int mostFrequentElement(int[] nums) {

        int maxElement = nums[0];
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            if (nums[i] > maxElement) {
                maxElement = nums[i];
            }
        }

        int[] hash = new int[maxElement+1];

        for ( int i = 0 ; i < n ; i++) {
            hash[nums[i]]++ ;
        }

        int max = hash[0];
        int answer = 0;

        for(int i = 0 ; i < hash.length ; i++ ) {
            if ( hash[i] >  max ){
                max = hash[i];
                answer = i ;
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
