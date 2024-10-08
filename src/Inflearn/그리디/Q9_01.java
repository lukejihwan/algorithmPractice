package Inflearn.그리디;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q9_01 {
    static int n;

    private int solution(ArrayList<Point> arr, int n){
        int cnt = 0;

        Collections.sort(arr);
        int max = Integer.MIN_VALUE;
        for(Point ob : arr){
            if(ob.y > max){
                cnt++;
                max = ob.y;
            }
        }


        return cnt;
    }
    public static void main(String[] args) {
        Q9_01 main = new Q9_01();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Point> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int x = in.nextInt();
            int y = in.nextInt();
            arr.add(new Point(x, y));
        }
        System.out.println(main.solution(arr, n));;

    }
}

class Point implements Comparable<Point> {
    int x, y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        return o.x - this.x;
    }
}
