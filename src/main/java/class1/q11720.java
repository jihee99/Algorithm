package class1;

import java.io.*;

public class q11720 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        String[] arr = br.readLine().split("");

        int sum = 0;
        for(int i=0; i<count; i++){
            int num = Integer.parseInt(arr[i]);
            sum += num;
        }
        System.out.println(sum);
    }

}
