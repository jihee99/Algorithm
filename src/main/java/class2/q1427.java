package class2;

import java.io.*;

public class q1427 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String originStr = br.readLine();
        int[] intArr = new int[originStr.length()];

        for(int i=0; i<originStr.length(); i++){
            intArr[i] = Integer.parseInt(originStr.substring(i,i+1));
        }

        for(int i=0; i< intArr.length; i++){
            int max = i;

            for(int j=i+1; j< intArr.length; j++){
                if(intArr[j] > intArr[max]){
                    max = j;
                }
            }

            if(intArr[max] > intArr[i]){
                int temp = intArr[i];
                intArr[i] = intArr[max];
                intArr[max] = temp;
            }
        }

        for(int i=0; i<intArr.length; i++){
            bw.write(String.valueOf(intArr[i]));
        }
        bw.flush();
        bw.close();
    }

}
