package Inflearn.Recursive;

import java.util.Scanner;

public class Q7_03 {
    private static int fibonacci(int N){
        if(N == 1) return 1;
        else{
            return N * fibonacci(N - 1);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();

        System.out.println(fibonacci(N));
    }
}
