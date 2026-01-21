package removeData;

import java.util.ArrayList;
import java.util.Collections;

public class SortElements {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(200);
        al.add(50);
        al.add(4);
        al.add(500);
        System.out.println("List1:- "+al);

        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(10);
        al2.add(200);
        al2.add(150);
        al2.add(5);
        al2.add(40);
        System.out.println("List2: -"+al2);

        // 1) sort(List list)
        // Sorts the specified list into ascending order, according to the natural
        // ordering of its elements.
        Collections.sort(al); // sort al in ascending order
        System.out.println("sort(List list) Ascending: " + al);
        
        Collections.reverse(al); // sort al in descending order
        System.out.println("sort(List list) Descending: " + al);
        

        // 2) sort(List list, Comparator c)
        // Sorts the specified list according to the order induced by the specified
        // comparator.
        Collections.sort(al2, (a, b) -> b - a); // sort al in descending order
        System.out.println("sort(List list, Comparator c) Descending: " + al2);

        Collections.sort(al2, (a, b) -> a - b); // sort al in ascending order
        System.out.println("sort(List list, Comparator c)Ascending: " + al2);

    }

}
