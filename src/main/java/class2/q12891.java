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
        int[] chkRule = new int[4];
        int[] alpha = new int[26];

        int count = 0;

        st = new StringTokenizer(br.readLine());

        for(int i=0; i<4; i++){
            chkRule[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<P; i++){
            int ascii = Integer.parseInt(str[i]);
            int alphabet = ascii - 65;
            alpha[alphabet]++;
        }


        int result = 0;
        int index = -1;
        while(P+index < str.length){
            index++;
            if(alpha[0] >= chkRule[0] && alpha[2] >= chkRule[1] && alpha[6] >= chkRule[2] && alpha[19] >= chkRule[3]) {
                result++;
            }
//            if(chkRule[0] >= checkCnt[0] && alpha[2] >= checkCnt[1] && alpha[6] >= checkCnt[2] && alpha[19] >= checkCnt[3]) {
//                answer++;
//            }

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
