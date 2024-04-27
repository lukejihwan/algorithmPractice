package Inflearn.배열;

import java.util.ArrayList;
import java.util.Scanner;

public class Q2_01 {

    private static ArrayList<Integer> solution1(int[] intArr){
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < intArr.length; i++){
            if(i != 0 && intArr[i - 1] < intArr[i]){
                list.add(intArr[i]);
            }else if(i == 0){
                list.add(intArr[i]);
            }
        }

        return list;
    }

    private static ArrayList<Integer> solution2(int[] intArr){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(intArr[0]);
        for(int i = 1; i < intArr.length; i++){
            if(intArr[i - 1] < intArr[i]) list.add(intArr[i]);
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] intArr = new int[N];
        for(int i = 0; i < N; i++){
            intArr[i] = in.nextInt();
        }
        for(int num : solution1(intArr)){
            System.out.print(num + " ");
        }
        System.out.println();
        for(int num : solution2(intArr)){
            System.out.print(num + " ");
        }


    }
}
