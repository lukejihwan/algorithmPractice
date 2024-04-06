package Inflearn;

import java.util.Scanner;

public class Q1_04 {


    private String solution1(int N){
        Scanner in = new Scanner(System.in);
        String answer = "";

        for(int i = 0; i < N; i++){
            String str = in.next();
            answer = "";

            for(int j = str.length(); j > 0; j--){
                answer += str.charAt(j - 1);
            }
            System.out.println(answer);

        }

        return answer;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        Q1_04 solution = new Q1_04();
        solution.solution1(N);

        return ;
    }
}
