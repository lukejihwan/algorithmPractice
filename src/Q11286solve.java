import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Q11286solve {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();
        int[] array=new int[num];
        int[] absArray=new int[num];

        for(int i=0; i<num; i++){
            array[i]=sc.nextInt();
            absArray[i]=Math.abs(array[i]);
        }

        Deque<Integer> deque=new LinkedList<>();
        for(int i=0; i<num; i++){
            if(array[i]!=0){
                deque.offer(array[i]);

            }else{
                int min=0;
                for(int j=0; j< deque.size(); j++){
                    if (Integer.signum(deque.peek())==-1) {

                    }else{

                    }
                    min=0;
                    min = min < deque.getFirst()? deque.getFirst() : min;
                }
                System.out.println(min);
            }

        }
    }
}
