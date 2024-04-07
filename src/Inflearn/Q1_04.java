package Inflearn;

import java.util.ArrayList;
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

    private ArrayList<String> solution2(int N, ArrayList list){
        ArrayList<String> answer = new ArrayList<>();

        for(int i = 0; i < N; i++){
            answer.add(new StringBuilder((String) list.get(i)).reverse().toString());
        }

        return answer;
    }


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        int N = in.nextInt();

        Q1_04 solution = new Q1_04();
        //solution.solution1(N);

        for(int i = 0; i < N; i++){
            list.add(in.next());
        }
        ArrayList<String> answer2 = solution.solution2(N, list);
        for(String str : answer2){
            System.out.println(str);
        }

        return ;
    }
}
