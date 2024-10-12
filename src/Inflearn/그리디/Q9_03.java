package Inflearn.그리디;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q9_03 {

    private int greed(ArrayList<Point3> list){
        int cnt = 1;
        int max = 0;
        int time = list.get(0).y;

        for(Point3 point : list){
            if(time < point.y && point.x < time){
                time = point.y;
                cnt++;
            }else if(point.x < time){
                cnt++;

            }

        }

        return cnt;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Q9_03 main = new Q9_03();
        int n = in.nextInt();

        ArrayList<Point3> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int x = in.nextInt();
            int y = in.nextInt();
            list.add(new Point3(x, y));
        }

        Collections.sort(list);
        System.out.println(main.greed(list));
    }
}

class Point3 implements Comparable<Point3> {
    int x, y;
    Point3(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point3 o) {
        if(o.x == this.x){
            return this.y - o.y;
        }
        return this.x - o.x;
    }
}