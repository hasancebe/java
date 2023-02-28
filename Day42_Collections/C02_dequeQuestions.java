package Day42_Collections;

import java.util.Deque;
import java.util.LinkedList;

public class C02_dequeQuestions {
    public static void main(String[] args) {
        Deque<String> dequeList=new LinkedList<>();
        dequeList.add("Nutella");
        dequeList.add("Cheese");
        dequeList.add("Speaker");

       /* ListIterator ll1= (ListIterator) dequeList.iterator();
        System.out.println(dequeList);
        System.out.println(ll1.next());*/

        Deque<String>tempraryList=new LinkedList<>();
        String product="";

        while (true) {
            try {
                product=dequeList.remove();
                tempraryList.add("Y"+product);
                System.out.println(tempraryList);
                System.out.println("*"+dequeList);
            } catch (Exception e) {
                break;
            }


        }
        dequeList=tempraryList;
        System.out.println(dequeList);
        }

    }

