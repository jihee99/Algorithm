package class2;

import java.io.*;

public class q2750 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] intArr = new int[N];

        for(int i=0; i<N; i++){
            intArr[i] = Integer.parseInt(br.readLine());
        }

        for(int i=0; i<N-1; i++){
            for(int j=0; j<N-1-i; j++){
                if(intArr[j]>intArr[j+1]){
                    int temp = intArr[j];
                    intArr[j] = intArr[j+1];
                    intArr[j+1] = temp;
                }
            }
        }

        for(int n:intArr){
            bw.write(String.valueOf(n));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
