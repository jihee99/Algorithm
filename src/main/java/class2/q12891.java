package class2;

//9 8
//CCTGGATTG
//2 0 1 1
// -> 0
//4 2
//GATA
//1 0 0 1
// ->2

import java.io.*;
import java.util.StringTokenizer;

public class q12891 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        String[] str = br.readLine().split("");

        char[] chkDna = new char[S];
        int[] chkRule = new int[91];


        int count = 0;

        st = new StringTokenizer(br.readLine());

        for(int i=0; i<4; i++){
            chkRule[i] = Integer.parseInt(st.nextToken());
        }


        for(int i=0; i<S-P+1; i++){
            int[] chkArr = new int[91];
            int end = i+P;
            // 투포인터?
            for(int j=0; j<chkStr.length(); j++){
                char ch = chkStr.charAt(j);
                chkArr[ch]++;
            }

            if(pwdValidChk(chkRule, chkArr)){
                count++;
            }

//            System.out.println(chkStr);
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }

    public static boolean pwdValidChk(int[] rules, int[] my){
        boolean pwdChk = false;
        for(int i=0; i<rules.length; i++){
            if(rules[i]==my[i]) pwdChk = true;
            else pwdChk = false;
        }
        return pwdChk;
    }
}
