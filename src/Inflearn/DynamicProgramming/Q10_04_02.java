package Inflearn.DynamicProgramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q10_04_02 {

    static int[] dy;
    public int solution(ArrayList<Brick> arr){
        int answer = 0;
        Collections.sort(arr);
        dy[0] = arr.get(0).height;
        answer = dy[0];
        for(int i = 1; i < arr.size(); i++){
            int max_h = 0;
            for(int j = i - 1; j >= 0; j--){
                if(arr.get(j).weight > arr.get(j).weight && dy[j] > max_h){
                    max_h = dy[j];
                }
            }
            dy[i] = max_h + arr.get(i).height;
            answer = Math.max(answer, dy[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Q10_04_02 main = new Q10_04_02();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Brick> arr = new ArrayList<>();
        dy = new int[n];
        for(int i = 0; i < n; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            arr.add(new Brick(a, b, c));
        }
        System.out.println(main.solution(arr));

    }
}
