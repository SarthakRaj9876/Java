package collection;
import java.util.*;

public class LaunchAL1 
{
    public static void main(String[] args) 
    {
        LinkedList ll = new LinkedList();

        ll.add(100);
        ll.add(200);
        ll.add(300);
        ll.add(300);

        System.out.println(ll);

        System.out.println(ll.get(1));

        System.out.println(ll.indexOf(200));

        System.out.println(ll.lastIndexOf(300));

        System.out.println(ll.getFirst());

        System.out.println(ll.getLast());

        ll.push(10);

        System.out.println(ll);

        System.out.println(ll.pop());



       /*  LinkedList ll2 = new LinkedList();

        ll2.add("sdfgh");
        ll2.add(50);
        ll2.add(55.55);

        System.out.println(ll2);

        ll2.addFirst(600);
        ll2.addLast(400);

        System.out.println(ll2);

        ll2.add(1, 555);

        System.out.println(ll2);

        System.out.println(ll2.peek());

        System.out.println(ll2);

        System.out.println(ll2.poll());

        System.out.println(ll2);
        
*/
    }
}
