package class2;

import java.io.*;
import java.util.Stack;

public class q17413 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        boolean flag = false;

        StringBuilder sb = new StringBuilder();

        Stack<Character> stack = new Stack<>();
        for(int i=0; i<str.length(); i++){

            if(str.charAt(i) == '<'){
                while(!stack.isEmpty()){
                    sb.append(stack.pop());
                }
                flag = true;
            }

            else if (str.charAt(i) == '>') {
                flag = false;
                sb.append(str.charAt(i));
                continue;
            }

            if (flag == true) {
                sb.append(str.charAt(i));
            } else if (flag == false) {
                // 해당 인덱스의 i번째 문자가 공백일 경우, 모든 원소를 POP수행 후 공백 추가
                if (str.charAt(i) == ' ') {
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(' ');
                    continue;
                } else {
                    // 그외의 경우, Stack에 문자 추가
                    stack.push(str.charAt(i));
                }
            }
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }
}
