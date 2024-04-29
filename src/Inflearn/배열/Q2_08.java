package Inflearn.배열;

import java.util.Scanner;

public class Q2_08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = in.nextInt();
        }

        //자신보다 큰 수 만큼 count++ 해서 출력하면 됨.
        int count = 0;
        for(int i = 0; i < N; i++){
            int num = arr[i];
            count = 0;
            for(int a = 0; a < N; a++){
                if(num < arr[a]) count++;
            }
            System.out.print(count + 1 + " ");
        }
    }
}
