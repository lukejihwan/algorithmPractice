package Inflearn.Recursive;

import java.util.Scanner;

public class Q7_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int[] array = new int[N];

        for(int i = 0; i < N; i++){
            array[i] = in.nextInt();
        }
    }
}
