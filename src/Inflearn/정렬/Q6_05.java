package Inflearn.정렬;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Q6_05 {

    private static String solution1(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int key : arr){
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        for(int check : arr){
            if(map.get(check) > 1){
                return "D";
            }
        }

        return "U";
    }

    private static String solution2(int[] arr){

        Arrays.sort(arr);
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] == arr[i + 1]) return "D";
        }

        return "U";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[] arr = new int[N];
        int[] arr2 = new int[N];
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
            arr2[i] = arr[i];
        }

        System.out.println(solution1(arr));
        System.out.println(solution2(arr2));

    }
}
