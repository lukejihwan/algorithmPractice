package Inflearn.Recursive;

import java.util.Scanner;

public class Q7_02 {

    private String str;
    private static void DFS(int N){
        if(N == 0) return;
        else{
            DFS(N / 2);
            System.out.print(N % 2);
        }

    }
    public static void main(String[] args) {
        // 10진수 2진수로 출력하기
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        DFS(N);
    }
}
