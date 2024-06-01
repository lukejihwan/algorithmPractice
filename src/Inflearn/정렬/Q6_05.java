package Inflearn.정렬;

import java.util.HashMap;
import java.util.Scanner;

public class Q6_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Map으로 푸는 것이 좋을 것 같음
        int N = in.nextInt();

        int[] arr = new int[N];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for(int check : arr){
            if(map.get(check) > 1){
                System.out.println("D");
                return;
            }
        }

        System.out.println("U");
    }
}
