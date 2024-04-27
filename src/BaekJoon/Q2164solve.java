package BaekJoon;

import java.awt.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Q2164solve {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        //int[] array=new int[a]; //a개의 숫자를 담는 배열

        //큐를 사용하여 푸는 문제
        Deque<Integer>  deque=new LinkedList<>();
        for(int i=0; i<a ;i++){
            deque.add(i+1); //가독성이 떨어진다.

        }
        while(deque.size()>1){
            deque.remove(); //remove메서드는 비어있으면 NosuchElementException이 발생하므로 가능하면 poll사용하자

            //이부분도 굳이 두 줄로 나누지 않고 한줄로 처리할 수 있는 부분
            int n=deque.remove();
            deque.add(n);

        }

        //pop메서드를 사용해도 되지만 보통 pop메서드는 Stack형태에서 사용하고,
        //Queue는 poll메서드를 많이 사용한다.
        System.out.println(deque.pop());

    }
}
