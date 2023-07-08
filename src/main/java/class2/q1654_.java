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
            max = Math.max(max, arr[i]);
        }

        long result = searchBinary(arr, max, N);

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();

    }


    public static long searchBinary(long[] arr, long max, int N){

        long min = 1;
        long half = 0;

        while(min <= max){
            half = (min + max) / 2;
            int count = 0;

            for(long i : arr){
                count += i/half;
            }

            // 원하는 랜선 갯수 보다 잘라진 랜선 수가 적을경우
            // 하나의 랜선 길이가 길어서 길이를 더 짧게 만들어야 함
            // half보다 아래의 수.
            if(count < N) {
                max = half-1;
            }
            // 원하는 랜선 갯수 보다 잘라진 랜선 수가 많을경우
            // 하나의 랜선 길이가 짧아서 더 길게 만들어야 함
            // half보다 위의 수에 있음.
            else {
                min = half+1;
            }

        }

        return (max+min)/2;
    }
}