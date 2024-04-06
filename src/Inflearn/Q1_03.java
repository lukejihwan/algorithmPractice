package Inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1_03 {

    public String solution1(String str){

        return "";
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split(" ");
        System.out.println(strArr.length);

        int bigIndex = 0;
        for(int i = 0; i < strArr.length; i++){
            bigIndex = strArr[i].length() > strArr[bigIndex].length() ? i : bigIndex;
        }
        System.out.println(strArr[bigIndex]);
        return ;
    }
}
