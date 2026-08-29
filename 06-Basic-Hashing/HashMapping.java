//

import java.util.*;

public class HashMapping {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size : ");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the element : ");
        for (int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }

        // Precalculating

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            map.put(array[i], map.getOrDefault(array[i], 0) + 1);
        }

        System.out.print("Enter the number to find : ");
        int num = sc.nextInt();

        System.out.println(map.get(num));

        sc.close();
    }
}
