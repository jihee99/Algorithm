package class2;

import java.io.*;
import java.util.*;

public class q1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        int max = -1;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(max<arr[i]) max = arr[i];
        }

        double result =0;
        for (double n : arr) {
//            result += n / max * 100;
            result += n;
        }
        bw.write(String.valueOf((result/ max * 100) /  N ));
        bw.flush();
        bw.close();
    }
}
