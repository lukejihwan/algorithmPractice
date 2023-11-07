package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q25304 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int priceSum = Integer.parseInt(br.readLine());
        int goodsTypes = Integer.parseInt(br.readLine());
        int countedSum = 0;

        for(int i = 0; i < goodsTypes; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int price = Integer.parseInt(st.nextToken());
            int ea = Integer.parseInt(st.nextToken());
            countedSum += price * ea;
        }

        if(priceSum == countedSum){
            System.out.println("Yes");
        } else if (priceSum != countedSum) {
            System.out.println("No");
        }
    }
}
