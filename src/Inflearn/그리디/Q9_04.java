package Inflearn.그리디;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Q9_04 {
    static int n;

    private int greed(ArrayList<Point4> list){
        PriorityQueue<Integer> pQ = new PriorityQueue(Collections.reverseOrder());

        int max = Integer.MIN_VALUE;
        int answer = 0;
        int j = 0;
        for(int i = max; i >= 1; i--){
            for( ; j < n; j++){
                if(list.get(j).d < i) break;
                pQ.offer(list.get(j).m);

            }
            if(!pQ.isEmpty()) answer += pQ.poll();
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Q9_04 main = new Q9_04();
        n = in.nextInt();
        ArrayList<Point4> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int m = in.nextInt();
            int d = in.nextInt();
            list.add(new Point4(m, d));
        }

        Collections.sort(list);

        System.out.println(main.greed(list));

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
        if(this.d == o.d){
            return o.m - this.m;
        }else{
            return o.d - this.d;
        }
    }
}
