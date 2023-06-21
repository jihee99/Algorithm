package class1;

import java.io.*;


public class q2475 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine().trim();

        String[] arr = str.split(" ");

        int result = 0;

        for(int i=0; i<arr.length; i++){

            int num = Integer.parseInt(arr[i]);

            num *= num;
            result += num ;

        }

        System.out.println(result%10);
//        int returnNum = ;
//        bw.write(returnNum);
//
//        bw.flush();
//        bw.close();
    }
}
