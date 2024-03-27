package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2751 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 정수의 수가 백만개 이므로, O(n^2)은 안되고 O (n) 이 되어야 한다.
        // 또는 nlogn 도 사용 가능하다. worst상황에서 1,000,000log1,000,000
        // 은 6,000,000 이 되는데, 1억 이하이므로 시간복잡도를 만족한다.
    }
}
