package class1;

import java.io.*;
import java.util.*;

public class q10818 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =  new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int index = 0;
        int[] arr = new int[count];

        while(st.hasMoreTokens()){
            arr[index] = Integer.parseInt(st.nextToken());
            index++;
        }
        Arrays.sort(arr);
        bw.write(String.valueOf(arr[0]) + " " + String.valueOf(arr[index-1]));

        bw.flush();
        bw.close();
    }
}
