package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());

        int forNum = number / 4;
        StringBuffer sb = new StringBuffer();
        StringBuilder sbd = new StringBuilder();
        for(int i=0; i<forNum; i++){
            sb.append("long ");
        }

        System.out.println(sb.toString() + "int");

    }
}
