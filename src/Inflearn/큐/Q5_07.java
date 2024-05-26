package Inflearn.큐;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q5_07 {
    private static String solution1(String str1, String str2){
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
            return "YES";
        }else{
            return "NO";
        }
    }

    private static String solution2(String str1, String str2){
        Queue<Character> q = new LinkedList<>();
        String answer = "YES";

        for(char n : str1.toCharArray()) q.offer(n);
        for(char n : str2.toCharArray()){
            if(q.contains(n)){
                if(n != q.poll()) return "NO";
            }
        }

        if(!q.isEmpty()) return "NO";

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();

        System.out.println(solution1(str1, str2));
        System.out.println(solution2(str1, str2));
    }
}
