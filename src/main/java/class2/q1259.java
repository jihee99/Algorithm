package class2;

import java.io.*;

public class q1259 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 반복문 사용하기
        String str;
        while(Integer.parseInt((str=br.readLine())) != 0){
            Boolean res = true;
            for(int i = 0;i<str.length()/2;i++) {
                if(str.charAt(i)!= str.charAt(str.length()-1-i)){
                    res = false;
                    break;
                }
            }
            if(res){
                bw.write("yes");
                bw.newLine();
            }else{
                bw.write("no");
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
    }
}
