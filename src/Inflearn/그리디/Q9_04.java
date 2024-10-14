package Inflearn.그리디;

import java.util.Scanner;

public class Q9_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();


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
