package class2;

import java.io.*;

public class q1032 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        String[] arr = new String[N];
        for(int i=0; i<N; i++){
            arr[i] = br.readLine();
        }
        boolean[] isSame = new boolean[arr[0].length()];
        for(int i=0; i<arr[0].length(); i++){
            for(int j=1; j < N; j++){
                System.out.print(j + " ");
                System.out.print(arr.length-1);
                System.out.println(" ");
                if (j == arr.length - 1) { // 인덱스를 넘어갈 수 있으므로 break 해준다
                    break;
                }
                if (arr[0].charAt(i) != arr[j].charAt(i)) { // 하나라도 다른게 있다면 체크해주고 break
                    isSame[i] = true;
                    break;
                }
            }
        }

        for(int i=0; i<isSame.length; i++){
            if(isSame[i]){
                bw.write("?");
            }else {
                bw.write(arr[0].charAt(i));
            }
        }
        bw.flush();
        bw.close();
    }
}

