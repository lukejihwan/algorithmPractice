package BaekJoon;

import java.io.*;

public class Q2751 {
    private static int[] sorted;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 정수의 수가 백만개 이므로, O(n^2)은 안되고 O (n) 이 되어야 한다.
        // 또는 nlogn 도 사용 가능하다. worst상황에서 1,000,000log1,000,000
        // 은 6,000,000 이 되는데, 1억 이하이므로 시간복잡도를 만족한다.
        int count = Integer.parseInt(br.readLine());
        int[] arr = new int[count];

        for(int i = 0; i < count; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        merge_sort(arr);

        for(int i = 0; i < arr.length; i++){
            bw.write(arr[i] + "\n");
        }

        br.close();
        bw.close();
    }

    public static void merge_sort(int[] a){
        sorted = new int[a.length];
        merge_sort(a, 0, a.length - 1);
    }

    private static void merge_sort(int[] a, int left, int right){
        if(left == right) return;

        int mid = (left + right) / 2;

        merge_sort(a, left, mid);
        merge_sort(a, mid + 1, right);

        merge(a, left, mid, right);

    }

    private static void merge(int[] a, int left, int mid, int right){
        int l = left;
        int r = mid + 1;
        int idx = left;

        while(l <= mid && r <= right){
            if(a[l] <= a[r]){
                sorted[idx] = a[l];
                idx++;
                l++;
            }else{
                sorted[idx] = a[r];
                idx++;
                r++;
            }
        }

        if(l > mid){
            while (r <= right){
                sorted[idx] = a[r];
                idx++;
                r++;
            }
        }else {
            while (l <= mid){
                sorted[idx] = a[l];
                idx++;
                l++;
            }
        }

        for (int i = left; i <= right; i++){
            a[i] = sorted[i];
        }
    }
}
