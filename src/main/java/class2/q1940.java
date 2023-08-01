package class2;

import java.io.*;
import java.util.StringTokenizer;

public class q1940 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }


        int cnt = 0;
        for(int start = 0; start<N; start++){
            int end = start+1;
            int sum = 0;

            while(end<N){
                sum = arr[start];
                sum += arr[end++];
                if(sum == M){
                    cnt++;
                    break;
                }
            }
        }


//        int start = 0, end = 0, sum = arr[0], cnt = 1;
//        while(end != N){
//            if(sum == M){
//                cnt++;
//                sum = sum + arr[end];
//                end++;
//            }
//            else if(sum < M){



//                sum = sum + arr[end];
//                end++;
//            }
//            else if(sum > M){
//                sum = sum - arr[start];
//                start++;
//            }
//        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}
