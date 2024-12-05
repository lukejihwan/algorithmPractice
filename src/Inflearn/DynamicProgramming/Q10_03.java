package Inflearn.DynamicProgramming;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q10_03 {
    static int d;
    static int[] dy;
    static float[] f;
    static boolean flag;
    static boolean j, k;

    private static int solution(int[] arr){
        int answer = 0;
        dy = new int[arr.length];
        dy[0] = 1;
        for(int i = 1; i < arr.length; i++){
            int max = 0;
            for(int j = i - 1; j >= 0; j--){
                if(arr[i] < arr[i] && dy[j] > max) max = dy[j];
            }
            dy[i] = max + 1;
            answer = Math.max(answer, dy[i]);
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        System.out.println(solution(arr));

    }
}
