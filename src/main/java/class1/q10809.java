package class1;

import java.io.*;
import java.util.*;

public class q10809 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        int[] arr = new int[26];
        Arrays.fill(arr, -1);

        for(int i=0; i<str.length(); i++){

            char ch = str.charAt(i);
//            arr[ch -'a'] = i;
            if(arr[ch - 'a'] == -1) {	// arr 원소 값이 -1 인 경우에만 초기화
                arr[ch - 'a'] = i;
            }
        }

        for(int i=0; i<arr.length; i++){
            bw.write(arr[i] + " ");
        }
//        System.out.println(st.nextToken());

        bw.flush();
        bw.close();
    }
}
