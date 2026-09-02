import java.util.*;

public class MergeSort {

    static void merge(ArrayList<Integer> list , int low , int mid , int high) {

        ArrayList<Integer> temp = new ArrayList<>();

        int left = low ;
        int right = mid+1 ;

        while(left <= mid && right <= high){

            if(list.get(left) < list.get(right)) {
                temp.add(list.get(left)) ;
                left ++ ;
            }
            else {
                temp.add(list.get(right));
                right ++ ;
            }
        }
        while( left <= mid) {
            temp.add(list.get(left)) ;
            left ++ ;
        }
        while( right <= high) {
            temp.add(list.get(right)) ;
            right ++ ;
        }

        for(int i = low ; i <= high ; i++){
            list.set(i , temp.get(i-low)) ;   // index of temp is i-low for checking all index value .
        }

    }

    static void mergeSort(ArrayList<Integer> list , int low , int high) {

        if( low >= high ){
            return;
        }
        int mid = (low + high) / 2 ;

        mergeSort(list , low , mid);
        mergeSort(list, mid+1 , high);
        merge(list , low, mid , high);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter the element : ");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        mergeSort(list , 0 , n-1);

        System.out.println("Sorted array : " + list);

        sc.close();
    }
}
