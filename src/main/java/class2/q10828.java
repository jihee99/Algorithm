package class2;
//push X: 정수 X를 스택에 넣는 연산이다.
//pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//size: 스택에 들어있는 정수의 개수를 출력한다.
//empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
//top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.


import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class q10828 {

    public static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());

            String order = st.nextToken();

            if(order.equals("push")){
                int num = Integer.parseInt(st.nextToken());
                stack.push(num);
            }
            else if(order.equals("pop")){
                if(!stack.empty()) {
                    bw.write(String.valueOf(stack.pop()));
                }else{
                    bw.write("-1");
                }
                bw.newLine();
            }
            else if(order.equals("size")){
                bw.write(String.valueOf(stack.size()));
                bw.newLine();
            }
            else if(order.equals("empty")){
                if(!stack.empty()) {
                    bw.write("0");
                }else{
                    bw.write("1");
                }
                bw.newLine();
            }
            else if(order.equals("top")){
                if(!stack.empty()) {
                    bw.write(String.valueOf(stack.peek()));
                }else{
                    bw.write("-1");
                }
                bw.newLine();
            }

        }

        bw.flush();
        bw.close();
    }

}
