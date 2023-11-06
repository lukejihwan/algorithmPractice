package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2480 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if(a == b && b == c){
            System.out.println(10000 + (a * 1000));
        }else if(a == b && b != c){
            System.out.println(1000 + (a * 100));
        }else if(a != b && b == c){
            System.out.println(1000 + (b * 100));
        }else if(a == c && b != c){
            System.out.println(1000 + (c * 100));
        }else if((a > b && b > c) || (a > b && a > c)){
            System.out.println(100 * a);
        }else if((b > a && a > c) || (b > a && b > c)){
            System.out.println(100 * b);
        }else if((c > a && a > b) || (c > a && c > b)){
            System.out.println(100 * c);
        }
    }
}
