package Inflearn.Recursive;

import java.util.Scanner;

public class Q7_05 {
    private static int solution1(int N){
        if(N == 0){
            return N;
        }else{}

        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        for(int i = 0; i < N; i++){
            System.out.print(i);
            System.out.println(i + i * 2);
        }
    }
}
