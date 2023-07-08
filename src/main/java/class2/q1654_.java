package class2;

import java.io.*;
import java.util.*;

public class q1654_ {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        long[] arr = new long[K];
        long max = -1;
        for(int i=0; i<K; i++){
            arr[i] = Long.parseLong(br.readLine());
            if(arr[i] > max) max = arr[i];
        }
        Arrays.sort(arr);
        for(long i : arr){
            System.out.println(i);
        }


        long result = searchBinary(arr, max, K);

        System.out.println(result);
        // 최대길이의 랜선을 찾는 함수 호출
        // 전달 인자 : arr, max


    }


    public static long searchBinary(long[] arr, long max, int N){

        long left = 1;
        long right = max;
        while(left <= right){
            long mid = (left + right) / 2;

            System.out.println("------------");
            System.out.println(mid);
            int sum = 0;

            for(long i : arr){
                sum += i/mid;
                System.out.println(sum);
            }

            System.out.println("   ");

            if(sum < N) right = mid-1;
            else if(sum >= N) left = mid+1;

        }

        return left;

    }
}