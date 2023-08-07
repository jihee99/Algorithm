package class2;

//9
//5 12 7 10 9 1 2 3 11
//13

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class q3273 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }


        int num = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        int start = 0;
        int end = arr.length-1;

        int result = 0;
        while(start<end){
            int sum = arr[start] + arr[end];

            if(sum == num){
                result++;
                start++;
                end--;
            } else if( sum < num ){
                start++;
            } else if ( sum > num ){
                end--;
            }
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
