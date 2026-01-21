package arrayListt;


//Access element - 3 methods

//1) get(Index)
//2) for each loop
//3) Iterator


import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class AccessElement {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(40);
        a1.add(50);
        a1.add(null);
        
        
        System.out.println(a1);
        System.out.println(a1.get(0));
        
     // 1) get(index)
        for(int i=0;i<a1.size();i++) {
        	System.out.print(a1.get(i)+" ");
        }
        System.out.println();
        
      //2) for each loop
        for(Object o : a1) {
        	System.out.print(o+" ");
        }
        
        System.out.println("\n============");
        
        
        // Iterator
        Iterator i = a1.iterator();
        System.out.println(i.next());
        System.out.println(i.next());
        System.out.println(i.next());
        System.out.println(i.next());
        
        while(i.hasNext()) {
        	System.out.println(i.next());
        	
        }
        System.out.println("============");
        
        
        
        // ListIterator
        ListIterator li = a1.listIterator();
        
        while(li.hasNext()) {
        	System.out.print(li.next()+" ");
        	
        }
        System.out.println("\n============");
        while(li.hasPrevious()) {
        	System.out.print(li.previous()+" ");
        }
	}

}

