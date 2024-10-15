package Inflearn.그리디;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Q9_04 {

    private int greed(ArrayList<Point4> list){
        PriorityQueue<Integer> pQ = new PriorityQueue(Collections.reverseOrder());

        for(Point4 a : list){
            System.out.println(a.m + " " + a.d);
        }



        return 0;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Q9_04 main = new Q9_04();
        int n = in.nextInt();
        ArrayList<Point4> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int m = in.nextInt();
            int d = in.nextInt();
            list.add(new Point4(m, d));
        }

        Collections.sort(list);

        main.greed(list);

    }
}

class Point4 implements Comparable<Point4>{
    int m;
    int d;
    Point4(int m, int d){
        this.m = m;
        this.d = d;
    }

    @Override
    public int compareTo(Point4 o) {
        if(this.m == o.m){
            return this.d - o.d;
        }else{
            return this.m - o.m;
        }
    }
}
