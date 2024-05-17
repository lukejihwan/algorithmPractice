package Inflearn.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Q4_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();

        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = in.nextInt();
        }
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        // 초기화
        for(int i = 0; i < K; i++){
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) + 1);
        }
        System.out.print(hashMap.size() + " ");

        int rt = K, lt = 0;
        while(rt < N){
            if(hashMap.get(arr[lt]) == 1){
                hashMap.remove(arr[lt]);
                hashMap.put(arr[rt], hashMap.getOrDefault(arr[rt], 0) + 1);
            }else{
                hashMap.put(arr[lt], hashMap.get(arr[lt]) - 1);
                hashMap.put(arr[rt], hashMap.getOrDefault(arr[rt], 0) + 1);
            };
            lt++;
            rt++;
            System.out.print(hashMap.size() + " ");
        }
    }
}
