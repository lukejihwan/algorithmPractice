package Inflearn;

import java.util.Scanner;

public class Q2_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] intArr = new int[N];
        for(int i = 0; i < N; i++){
            intArr[i] = in.nextInt();
        }
        for(int i = 0; i < N; i++){
            if(i != 0 && intArr[i - 1] < intArr[i]){
                System.out.print(intArr[i] + " ");
            }else if(i == 0){
                System.out.print(intArr[i] + " ");
            }
        }
    }
}
