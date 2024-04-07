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

    private ArrayList<String> solution3(int N, ArrayList<String> list){
        ArrayList<String> answer = new ArrayList<>();

        for(String str : list){
            char[] charArr = str.toCharArray();
            int lt = 0, rt = charArr.length - 1;

            while (lt < rt){
                char first = charArr[lt];
                char last = charArr[rt];
                charArr[lt] = last;
                charArr[rt] = first;
                lt++;
                rt--;
            }
            answer.add(String.valueOf(charArr));
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
        ArrayList<String> answer3 = solution.solution3(N, list);
        for(String str : answer2){
            System.out.println(str);
        }
        for(String str : answer3){
            System.out.println(str);
        }
        return ;
    }
}
