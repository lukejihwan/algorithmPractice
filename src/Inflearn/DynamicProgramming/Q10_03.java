package Inflearn.DynamicProgramming;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q10_03 {
    static int d;
    static float[] f;
    static boolean flag;

    private static int solution(int[] arr){


        return 0;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int a;

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        int[] array = new int[n + 1];
        for(int i = 1; i < array.length; i++){
            array[i] = in.nextInt();
        }


        System.out.println(solution(arr));

    }
}
