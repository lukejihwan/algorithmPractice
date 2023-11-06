import java.util.Arrays;
import java.util.Scanner;

public class Q1377solve {

    public static void main(String[] args){
        //먼저 이문제는 O(n^2)이 되면 시간제한을 넘기기 때문에 다른 방법을 생각해야함.
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();
        int[] array=new int[N];

        for (int i=0; i<N; i++){
            array[i]=sc.nextInt();
        }

        Arrays.sort(array);

        
    }
}
