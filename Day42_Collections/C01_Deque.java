package Day42_Collections;

import java.util.Deque;
import java.util.LinkedList;

public class C01_Deque {
    public static void main(String[] args) {
        Deque<String>dq1=new LinkedList<>();
        dq1.add("a");
        dq1.addLast("v");
        dq1.addFirst("e");
        System.out.println(dq1);
        System.out.println("***************");

        dq1.offer("l");
        System.out.println(dq1);

        System.out.println(dq1.pop());
        System.out.println(dq1.poll());
        System.out.println(dq1.element());
        System.out.println(dq1.offerFirst("w"));
        System.out.println(dq1);
        System.out.println(dq1.stream());
        System.out.println(dq1.removeFirstOccurrence("q"));
        System.out.println(dq1.add("q"));
        dq1.add("q");
        System.out.println(dq1);
        System.out.println(dq1.removeFirstOccurrence("q"));
        System.out.println(dq1);
        System.out.println(dq1.iterator());
        System.out.println(dq1);


    }
}
