package Inflearn.DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q10_06 {
    static int[] answers;
    static int m;

    public static int solution(Question[] arr){

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){

            for(int j = m; j >= arr[i].time; j--){
                answers[j] = Math.max(answers[j - arr[i].time] + arr[i].score, answers[j]);
                max = Math.max(answers[j], max);
            }

        }

        return max;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        m = in.nextInt();

        Question[] list = new Question[n];
        answers = new int[m + 1];
        for(int i = 0; i < n; i++){
            int x = in.nextInt();
            int y = in.nextInt();
            list[i] = new Question(x, y);
        }

        System.out.println(solution(list));

    }
}

class Question{
    int score, time;
    Question(int score, int time){
        this.score = score;
        this.time = time;
    }
}
