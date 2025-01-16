// package DSA.ArrayList;

import java.util.ArrayList;

public class RemoveEven {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(59);
        list.add(10);
        list.add(12);
        list.add(9);
        list.add(5);
        System.out.println("List before removal : " + list);

        // removing even

        for (int i = list.size()-1; i >= 0; i--) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }
        }

        System.out.println("List after removal : " + list);

    }
}
