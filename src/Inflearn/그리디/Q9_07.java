package Inflearn.그리디;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q9_07 {
    static int[] unf;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v = in.nextInt();
        int e = in.nextInt();
        unf = new int[v + 1];
        ArrayList<Edge1> arr = new ArrayList<>();
        for(int i = 1; i <= v; i++) unf[i] = i;
        for(int i = 0; i < v; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            arr.add(new Edge1(a, b, c));
        }
        int answer = 0;
        Collections.sort(arr);
        for(Edge1 ob : arr){
            int fv1 = Find(ob.v);
            int fv2 = Find(ob.x);
            if(fv1 != fv2){
                answer += ob.cost;
                Union(ob.v, ob.x);
            }
        }

        System.out.println(answer);

    }
}

class Edge1 implements Comparable<Edge>{
    int v;
    int x;
    int cost;
    Edge1(int v, int x, int cost){
        this.v = v;
        this.x = x;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge o) {
        return o.cost - this.cost;
    }
}
