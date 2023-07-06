package class2;

import java.io.*;

public class q1436 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        String result = searchNum(num);
        bw.write(result);
        bw.flush();
        bw.close();
    }

    public static String searchNum(int n){

        int cnt = 1, number = 666;

        while(n != cnt){
            number++;
            if(String.valueOf(number).contains("666")){
                cnt++;
            }
        }
        return String.valueOf(number);
    }
}
