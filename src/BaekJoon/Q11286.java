package BaekJoon;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Q11286 {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());

        //우선순위 큐를 선언해서 사용하자
        //우선순위 큐가 어떻게 동작하는지 미리 정의해놓고 시작한다. 그래서
        //절대값이 가장 작고 절대값이 같은 두 수가 있다면 그중에 작은수가 가장 앞쪽으로 오도록 설계를 해논다.
        PriorityQueue<Integer> MyQueue=new PriorityQueue<>((o1,o2) -> {
            int first_abs=Math.abs(o1);
            int second_abs=Math.abs(o2);
            if(first_abs == second_abs)
                return o1 > o2 ? 1 : -1; //이게 맞지 않나?
            else
                return first_abs - second_abs;
        });

        for (int i=0; i<N; i++){
            int request=Integer.parseInt(br.readLine());
            if(request==0){
                if(MyQueue.isEmpty())
                    System.out.println("0");
                else
                    System.out.println(MyQueue.poll());
            }else{
                MyQueue.add(request);
            }
        }
    }
}
