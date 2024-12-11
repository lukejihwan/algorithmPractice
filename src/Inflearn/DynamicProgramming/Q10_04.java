package Inflearn.DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q10_04 {
    static int[] answer;

    public static int solution(Brick[] arr){

        for(int i = 0; i < arr.length; i++){
            Brick brick = arr[i];
            int sum = 0;
            for(int j = i; j >= 0; j--){
                if(arr[j].weight > brick.weight){
                    int bigOne = arr[j].height < answer[j] ? answer[j] : arr[j].height;
                    sum = Math.max(bigOne, sum);
                }
            }
            sum += brick.height;
            answer[i] = sum;

        }

        int ans = 0;
        for(int i = 0; i < arr.length; i++){
            ans = Math.max(answer[i], ans);
        }


        return ans;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Brick[] arr = new Brick[n];
        answer = new int[n];
        for(int i = 0; i < n; i++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            arr[i] = new Brick(x, y, z);
        }

        Arrays.sort(arr);

        System.out.println(solution(arr));

    }
}

class Brick implements Comparable<Brick>{
    int extent, height, weight;
    Brick(int extent, int height, int weight){
        this.extent = extent;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Brick o) {
        return o.extent - this.extent;
    }
}
