package class2;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class q11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] intArr = new int[N];

        int[] sumArr = new int[N];

        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            intArr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        Arrays.sort(intArr);

        sumArr[0] = intArr[0];

        for(int i=1; i<N; i++){
            sumArr[i] = sumArr[i-1] + intArr[i];
        }

        int result = 0;

        for(int i=0; i<N; i++){
            result += sumArr[i];
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
