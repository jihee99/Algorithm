package class2;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class q1253 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int good = 0;

        for (int i = 0; i < N; i++) {

            int find = arr[i];
            int start = 0, end = N - 1;

            while (start < end) {
                int sum = arr[start] + arr[end];
                if (sum == find) {
                    if (start != i && end != i) {
                        good++;
                        break;
                    }
                    else if (start == i) start++;
                    else if (end == i) end--;
                } else if (sum < find) {
                    start++;
                } else if (sum > find) {
                    end--;
                }
            }
        }

        bw.write(String.valueOf(good));
        bw.flush();
        bw.close();
    }
}