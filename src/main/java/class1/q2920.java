package class1;

import java.io.*;

public class q2920 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");

        boolean isIncreasing = true;
        boolean isDecreasing = true;
        for(int i=1; i<str.length; i++){
            int a = Integer.parseInt(str[i]);
            int b = Integer.parseInt(str[i-1]);

            if(a>b){
                isDecreasing = false;
            }else if(a<b){
                isIncreasing = false;
            }
        }

        if(isIncreasing){
            bw.write("ascending");
        }else if (isDecreasing){
            bw.write("descending");
        }else{
            bw.write("mixed");
        }

        bw.flush();
        bw.close();
    }
}
