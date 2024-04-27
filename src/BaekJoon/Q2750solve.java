package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q2750solve {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int a=Integer.parseInt(br.readLine());

        int[] array=new int[a];

        for(int i=0; i<a; i++){
            array[i]=Integer.parseInt(br.readLine());
        }
        int min=0;
        int count=0;

        for (int i=0; i<a-1; i++){ //a-1번 만큼 반복
            count=0;
            for (int j=0; j<a-1-i; j++){
                min=array[j+1];
                //array[j+1]=array[j]<array[j+1]? array[j+1] : array[j];
                if(array[j]>array[j+1]){
                    array[j+1]=array[j];
                    array[j]=min;
                    count++;
                }
            }
            if (count==0)break;
            System.out.println(count);
        }
        for(int i=0; i<a; i++){
            System.out.println(array[i]);

        }
    }
}
