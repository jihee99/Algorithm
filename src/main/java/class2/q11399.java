package class2;

import java.io.*;
import java.util.StringTokenizer;

public class q11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] intArr = new int[N];

        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++){
            intArr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        for(int i=1; i<N; i++){
            int current = intArr[i];
            for(int j=0; j<1; j++){
                if(intArr[j] > current){
                    int temp =
                }
            }
        }


    }
}
