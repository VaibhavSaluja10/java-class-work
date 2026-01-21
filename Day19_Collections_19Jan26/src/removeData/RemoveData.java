package removeData;

import java.util.ArrayList;

// 1) remove(Object o)
// 2) remove(int index)
// 3) removeAll(Collection c)
// 4) removeIf(Predicate p)
// 5) retainAll(Collection c)
// 6) clear()
public class RemoveData {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("List1:- "+list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(200);
        list2.add(300);
        list2.add(500);
        list2.add(40);
        System.out.println("List2: -"+list2);

        // 1) remove(Object o)
        // remove the first occurrence of the specified element from this list, if it is present.
        list.remove(Integer.valueOf(20)); // remove 20 from list
        System.out.println("remove(Object o)"+list);

        // 2) remove(int index)
        // Removes the element at the specified position in this list.
        list.remove(1); // remove element at index 1
        System.out.println("remove(int index)"+list);

        // 3) removeAll(Collection c)
        // Removes from this list all of its elements that are contained in the specified collection.
        list.removeAll(list2); // remove all elements of list2 from list
        System.out.println("removeAll(Collection c)"+list);

        // 4) removeIf(Predicate p)
        // remove all of the elements of this collection that satisfy the given predicate.
        list.removeIf(n -> n % 2 != 0); // remove all elements of list that are not divisible by 2
        System.out.println("removeIf(Predicate p)"+list);

        // 5) retainAll(Collection c)
        // Retains only the elements in this list that are contained in the specified collection.
        list.retainAll(list2); // retain all elements of list2 in list
        System.out.println("retainAll(Collection c)"+list);

        // 6) clear()
        // Removes all of the elements from this list.
        list.clear(); // remove all elements from list
        System.out.println("clear()"+list);
    }

}
