package Inflearn;

import java.util.Scanner;

public class Q1_09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String answer = "";
        char[] charArr = str.toCharArray();

        for(char N : charArr){
            if(Character.isDigit(N)) answer += N;
        }

        System.out.println(Integer.parseInt(answer));
        return ;
    }
}
