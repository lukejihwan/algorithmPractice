package Inflearn.그리디;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q9_03_2 {

    private int solution(ArrayList<Point3_2> arr){

        int cnt = 0;
        int max = 0;
        for(Point3_2 one : arr){
            if(one.state == 's'){
                cnt++;
            }else{
                cnt--;
            }
            max = Math.max(cnt, max);
        }

        return max;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Q9_03_2 main = new Q9_03_2();
        int n = in.nextInt();

        ArrayList<Point3_2> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int f = in.nextInt();
            arr.add(new Point3_2(f, 's'));
            int e = in.nextInt();
            arr.add(new Point3_2(e, 'e'));
        }

        Collections.sort(arr);

        System.out.println(main.solution(arr));

    }
}

class Point3_2 implements Comparable<Point3_2>{
    int x;
    char state;
    Point3_2(int x, char state){
        this.x = x;
        this.state = state;
    }

    @Override
    public int compareTo(Point3_2 o) {
        if(o.x == this.x) return this.state - o.state;
        else return this.x - o.x;
    }
}
