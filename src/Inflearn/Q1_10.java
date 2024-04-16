package Inflearn;

import java.util.Scanner;

public class Q1_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char N = in.next().charAt(0);

        char[] charArr = str.toCharArray();

        int[] indexArr = new int[str.length()];

        int count = 0;
        String answer = "";
        for(int i = 0; i < charArr.length; i++){
            if(charArr[i] == N){
                indexArr[i] = 0;
                count = 0;
            }else{
                count++;
                indexArr[i] = count;
            }

            /*if(i == charArr.length - 1){
                answer += indexArr[i];
            }else{
                answer += indexArr[i] + " ";
            }*/
        }

        for(int i = charArr.length - 1; i >= 0; i--){
        }

        System.out.println(answer);

    }
}
