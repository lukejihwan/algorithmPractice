package BaekJoon;

import java.util.LinkedList;

public class Queue {

    public static void main(String args[]){
        LinkedList list=new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);


        System.out.println(list.peek());
        System.out.println(list.poll());
        System.out.println(list.remove());
        System.out.println(list.poll());
        System.out.println(list.poll());
        System.out.println(list.poll());
        System.out.println(list.poll());
        System.out.println(list.poll());
    }
}
