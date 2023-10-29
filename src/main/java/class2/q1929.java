package class2;

import java.io.*;
import java.util.*;

public class q1929 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        boolean[] arr = new boolean[end+1];

        // true 소수아님, false 소수
        Arrays.fill(arr, false);

        arr[0] = arr[1] = true;

        for(int i=2; i<arr.length; i++){
            if(arr[i]) continue;
            for(int j=i+i; j<arr.length; j += i){
                arr[j] = true;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=start; i<=end; i++){
            if(!arr[i]) sb.append(i).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        int M = Integer.parseInt(st.nextToken());
//        int N = Integer.parseInt(st.nextToken());
//
//        boolean arr[] = new boolean[N+1];
//        arr[0] = arr[1] = true;
//
//        int sqrt = (int)Math.sqrt(N);
//        for(int i=2; i<=sqrt; i++) {
//            for(int j=2; j<=N/i; j++) {
//                if(arr[i*j] == true) {
//                    continue;
//                }
//                else  {
//                    arr[i*j] = true;
//                }
//            }
//        }
//
//
//        for(int i=M; i<=N; i++) {
//            if(arr[i] == false) {
//                bw.write(String.valueOf(i));
//                bw.newLine();
//            }
//        }
//
//        bw.flush();
//        bw.close();
    }

}