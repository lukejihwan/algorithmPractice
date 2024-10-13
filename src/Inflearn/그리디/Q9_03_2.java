package Inflearn.그리디;

public class Q9_03_2 {
    public static void main(String[] args) {

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
