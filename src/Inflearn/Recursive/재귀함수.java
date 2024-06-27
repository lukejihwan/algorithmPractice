package Inflearn.Recursive;

import java.util.Scanner;

public class 재귀함수 {
    private static void count(int N){
        if(N == 0){
            return;
        }else{
            count(N - 1);
            System.out.print(N + " ");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        count(N);
    }
}
