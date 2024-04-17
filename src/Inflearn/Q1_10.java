package Inflearn;

import java.util.Scanner;

public class Q1_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char N = in.next().charAt(0);

        int[] indexArr = new int[str.length()];

        int count = 1000;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == N){
                indexArr[i] = 0;
                count = 0;
            }else{
                count++;
                indexArr[i] = count;
            }
        }

        count = 1000;
        for(int i = str.length() - 1; i >= 0; i--){
            if(str.charAt(i) == N){
                count = 0;
            }else{
                count++;
                indexArr[i] = Math.min(indexArr[i], count);
            }
        }

        for(int a : indexArr){
            System.out.print(a + " ");
        }

    }
}
