package Inflearn.정렬;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q6_07 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        ArrayList<Pos> list = new ArrayList<>();
        for(int i = 0; i < N; i++){
            list.add(new Pos(in.nextInt(), in.nextInt()));
        }

        Collections.sort(list);

        for(Pos o : list){
            System.out.println(o.x + " " + o.y);
        }
    }
}

class Pos implements Comparable<Pos>{
    public int x, y;

    Pos(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Pos o){
        if(this.x == o.x){
            return o.y - this.y;
        }else{
            return this.x - o.x;
        }
    }

}