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
import java.util.HashMap;
import java.util.StringTokenizer;

public class q12891 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        String dna = br.readLine();

        char[] chkDna = new char[S];
        int[] A = new int[4];


        int count = 0;

        st = new StringTokenizer(br.readLine());

        for(int i=0; i<4; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<S-P+1; i++){
            int[] chkArr = new int[4];
            int end = i+P;
            String chkStr = dna.substring(i, end);

            for(int j=0; j<chkStr.length(); j++){
                char ch = chkStr.charAt(j);
                switch (ch){
                    case 'A':
                        chkArr[0]++;
                        break;
                    case 'C':
                        chkArr[1]++;
                        break;
                    case 'G':
                        chkArr[2]++;
                        break;
                    case 'T':
                        chkArr[3]++;
                        break;
                }
            }

            if(pwdValidChk(A, chkArr)){
                count++;
            }

//            System.out.println(chkStr);
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }

    public static boolean pwdValidChk(int[] A, int[] my){
        boolean pwdChk = false;
        for(int i=0; i<4; i++){
            if(A[i]==my[i]) pwdChk = true;
            else pwdChk = false;
        }
        return pwdChk;
    }
}
