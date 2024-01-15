package BaekJoon;

import java.io.*;
import java.util.ArrayList;

public class Q2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //색종이 갯수를 입력 받는다.
        int count = Integer.parseInt(br.readLine());

        //색종이 갯수 만큼을 곱해서 면적을 저장한다.
        int area = count * 10 * 10;

        //두번째 줄의 x값에 10을 더한값과 y값에 10을 더한 값과 그 아래 나오는 숫자들이
        //둘다 작을 경우에만 곱해서 면적에 저장한다.
        ArrayList<Pair> pairArr= new ArrayList<Pair>();

        for(int i = 0; i < count; i++){
            String[] strArr = br.readLine().split(" ");
            pairArr.add(new Pair(Integer.parseInt(strArr[0]), Integer.parseInt(strArr[1])));
        }

        System.out.println(pairArr.get(0).x);

        //색종이 면적에서 곱해서 나온 면적을 뺸다.
    }


}

class Pair{
    int x, y;
    Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
}
