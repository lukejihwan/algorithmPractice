package Inflearn.큐;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q5_07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();

        Queue<Character> q1 = new LinkedList<>();
        for(char n : str1.toCharArray()){
            q1.offer(n);
        }

        Queue<Character> q2 = new LinkedList<>();
        for(char n : str2.toCharArray()){
            q2.offer(n);
        }


        for(int i = 0; i < str2.length(); i++){
            if(q2.poll() == q1.peek()){
                q1.poll();
            }
        }

        if(q1.isEmpty()){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

        return ;
    }
}
