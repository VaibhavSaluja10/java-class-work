package arrayListPrograms;

import java.util.ArrayList;

public class AddingData {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(40);
        a1.add(50);
        a1.add(null);
        a1.add("Hello");

        System.out.println(a1);

        a1.remove(2); // remove by index
        System.out.println(a1);

        ArrayList a2 = new ArrayList();
        a2.add(60);
        a2.add(70);
        a2.add(80);
        a2.add(90);
        a2.add(100);
        a2.add(null);
        a2.add("Hii");

        // a2.add(a1); // add another arraylist to the arraylist
        // a2.addAll(a1); // add all elements of another arraylist to the arraylist

        a1.add(4, 505); // add element at specific index
        System.out.println(a1);

        a2.addAll(0, a1);
        System.out.println(a2);

        // how to find element from array list?
        System.out.println(a2.get(2)); // value at index 2

        System.out.println(a2.contains(20)); // true or false
        System.out.println(a2.contains(a1)); // why it give false? // because it is not checking the values of arraylist
        // what it is checking? // it is checking the reference of arraylist
        

        // to search element from array list?
        System.out.println(a2.indexOf(20)); // index of element

    }

}

// characeteristics of arraylist
// 1. it is resizable
// 2. it is heterogenous means it can store different types of data
// 3. it is ordered
// 4. it is index based
// 5. it is dynamic
// 6. it is not synchronized
// 7. it is not fixed size
// 8. it is not thread safe
