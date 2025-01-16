// package DSA.ArrayList;

import java.util.ArrayList;

public class Intro {
    public static void main(String[] args) {
        // creation
        ArrayList<Integer> list = new ArrayList<>();

        // add
        list.add(59);
        list.add(10);
        list.add(9);
        list.add(5);
        System.out.println(list);

        // add at index
        list.add(0, 40);
        System.out.println(list);

        // get
        System.out.println(list.get(1));

        // set
        list.set(0, 400);
        System.out.println(list);

        // remove
        // removing from end is less expensive than start
        list.remove(1);
        System.out.println(list);

        // size
        System.out.println("Size : "  + list.size());

        // print using for loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
