import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args){

        //Declare an arraylist
        ArrayList<Integer> v = new ArrayList<>();

        //adding elements
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(50);

        //accessing element
        System.out.println(v.get(0)); // 10
        System.out.println(v.get(1)); // 50

        //changing an element
        v.set(1,60);
        v.set(0,70);
        System.out.println(v.get(0)); //70
        System.out.println(v.get(1)); //60

        //getting size
        System.out.println(v.size());

        System.out.println(v);

        //removing an element
        v.remove(v.size() - 1);
        System.out.println(v);

        //remove by index value
        v.remove(0);
        System.out.println(v);

        //checking if an element exists
        if(v.contains(30)){
            System.out.println("present");
        }

        //find index of an element
        System.out.println(v.indexOf(60));

        //print arrayist by using forloop
        for(int x: v) {
            System.out.print(x + " ");
        }

        System.out.println();

        //insert one vector to another

        ArrayList<Integer> v2 = new ArrayList<>();
        v2.add(1);
        v2.add(2);
        v2.add(5);
        v2.add(8);

        ArrayList<Integer> v3 = new ArrayList<>(v2);
        System.out.println(v2);




    }
}
