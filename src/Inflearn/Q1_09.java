package Inflearn;

import java.util.Scanner;

public class Q1_09 {

    protected int solution1(String str){
        String answer = "";
        char[] charArr = str.toCharArray();

        for(char N : charArr){
            if(Character.isDigit(N)) answer += N;
        }

        return Integer.parseInt(answer);
    }

    protected int solution2(String str){
        int answer = 0;

        for(char N : str.toCharArray()){
            if(N >= 48 && N <= 57) answer = answer * 10 + (N - 48);
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        Q1_09 object = new Q1_09();
        System.out.println(object.solution1(str));
        System.out.println(object.solution2(str));
        return ;
    }
}
