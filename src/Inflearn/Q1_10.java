package Inflearn;

import java.util.Scanner;

public class Q1_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char N = in.next().charAt(0);

        char[] charArr = str.toCharArray();

        int[] indexArr = new int[str.length()];

        for(int i = 0; i < charArr.length; i++){
            if(charArr[i] == N){
                indexArr[i] = 0;
            }
        }

    }
}
