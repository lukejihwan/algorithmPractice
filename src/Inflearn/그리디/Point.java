package Inflearn.그리디;

public class Point implements Comparable<Point> {
    int x, y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        return o.x - this.x;
    }
}
