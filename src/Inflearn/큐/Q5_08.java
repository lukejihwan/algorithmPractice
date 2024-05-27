package Inflearn.큐;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q5_08 {

    private static int solution1(int[] arr, int N, int K){
        Queue<Person> q = new LinkedList<>();
        for(int i = 0; i < N; i++){
            q.offer(new Person(i, arr[i]));
        }

        int answer = 0;
        while(true){
            Person person = q.poll();
            int num = person.priority;
            boolean flag = true;
            for(Person x : q){
                if(x.priority > num){
                    q.offer(person);
                    flag = false;
                    break;
                }
            }
            if(flag){
                answer++;
            }

            if(flag && person.id == K){
                return answer;
            }

        }
    }

    private static int solution2(int[] arr, int N, int K){
        Queue<Person> queue = new LinkedList<>();
        for(int i = 0; i < N; i++){
            queue.offer(new Person(i, arr[i]));
        }
        int answer = 0;
        while(!queue.isEmpty()){
            Person person = queue.poll();
            for(Person x : queue){
                if(person.priority < x.priority){
                    queue.offer(person);
                    person = null;
                    break;
                }
            }

            if(person != null){
                answer++;
                if(person.id == K) return answer;
            }

        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int K = in.nextInt();

        // K번째 환자의 위험도보다 큰 환자들은 모두 앞으로 밀어 넣고,
        // K번째 환자와 위험도가 같은 환자들의 순서를 기억해 두어야 한다.
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = in.nextInt();
        }

        System.out.println(solution1(arr, N, K));
        System.out.println(solution2(arr, N, K));

    }
}

class Person{
    int id;
    int priority;
    public Person(int id, int priority){
        this.id = id;
        this.priority = priority;
    }
}
