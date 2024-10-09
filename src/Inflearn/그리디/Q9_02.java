package Inflearn.그리디;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q9_02 {

    public int greedy(ArrayList<Point1> arr){
        int last = 0;
        int cnt = 0;

        for(Point1 point : arr){
            if(last <= point.x){
                last = point.y;
                cnt++;
            }
        }

        return cnt;
    }
    public static void main(String[] args) {
        Q9_02 main = new Q9_02();
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        ArrayList<Point1> arr = new ArrayList<>();
        for(int i = 0; i < num; i++){
            int x = in.nextInt();
            int y = in.nextInt();
            arr.add(new Point1(x, y));
        }

        Collections.sort(arr);

        System.out.println(main.greedy(arr));
    }

}

class Point1 implements Comparable<Point1>{
    int x, y;
    Point1(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point1 o) {
        if(y == o.y){
            return x - o.x;
        }
        return y - o.y;
    }
}
