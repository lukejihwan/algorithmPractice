package Inflearn.그리디;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q9_07 {
    static int[] unf;
    static float[] d, f, a;

    public static int Find(int v){
        if(unf[v] == v){
            return v;
        }else{
            return unf[v] = Find(unf[v]);
        }
    }

    public static void Union(int a, int b){
        int af = Find(a);
        int bf = Find(b);
        if(af != bf) unf[af] = bf;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v = in.nextInt();
        int e = in.nextInt();
        unf = new int[v + 1];
        ArrayList<Edge1> arr = new ArrayList<>();
        for(int i = 1; i <= v; i++) unf[i] = i;
        for(int i = 0; i < e; i++){
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

class Edge1 implements Comparable<Edge1>{
    public int v;
    public int x;
    public int cost;
    Edge1(int v, int x, int cost){
        this.v = v;
        this.x = x;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge1 o) {
        return this.cost - o.cost;
    }

}
