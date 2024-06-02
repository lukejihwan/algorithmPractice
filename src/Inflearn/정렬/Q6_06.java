package Inflearn.정렬;

import java.util.Scanner;

public class Q6_06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = in.nextInt();
        }

        boolean firstPrinted = false;
        for(int i = 0; i < N - 1; i++){
            if(arr[i] > arr[i + 1] && !firstPrinted){
                System.out.print(i + 1 + " ");
                firstPrinted = true;
            }else if(arr[i] > arr[i + 1] && firstPrinted){
                System.out.print(i + 2 + " ");
            }
        }
    }
}
