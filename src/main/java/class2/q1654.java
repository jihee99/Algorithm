package class2;

import java.io.*;
import java.util.*;

public class q1654 {

    public static int N;
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        // 랜선의 길이는 2^31-1보다 작거나 같은 자연수이기 때문에 long 타입을 사용
        long result = 0;
        long max = 0;

        long[] arr = new long[K];
        for(int i=0; i<K; i++){
            arr[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, arr[i]);
        }

        result = binarySearch(arr, max, N);

        // 함수 호출
        // 전달 인자 : arr, max, N


    }



    public static int binarySearch(long[] arr, long max, int N){

        // 자른 랜선의 총 갯수
        // 가장 긴 랜선을 나누는 수,,?
        long half = 0;
        long min = 1;

        while(min <= max) {
            half = (min + max)/2;
        }


        // for {
        // i개로 가장 긴 랜선을 나눈 후 해당 길이로 나머지 랜선을 나눔
        // if(총 갯수가 N개 일 때) return
        // else if(총 갯수가 N보다 작을때) 다시 for문으로 돌아감 -> for문으로 다시 어떻게 돌아가?
        // else if(총 갯수가 N 보다 클 때) 나누는 수를 -1 함
        // }
        return 0;
    }


}
