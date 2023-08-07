package class2;
//8
//4
//3
//6
//8
//7
//5
//2
//1


import java.io.*;
import java.util.Stack;

public class q1874 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        int[] arr = new int[N];

        //배열의 인덱스 값을 담당할 변수
        int index = 0;
        //1~n까지의 현재 값을 담당할 변수
        int num = 1;


        StringBuilder sb = new StringBuilder();

        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i=1; i<=N; i++){
            stack.push(i);
            sb.append("+").append("\n");
            while(!stack.empty() && stack.peek() == arr[index]){
                stack.pop();
                sb.append("-").append("\n");
                index++;
            }
        }

//        while(index<N){
//
//            if(!stack.empty() && arr[index] < stack.get(stack.size() - 1)){
//                break;
//            } else if(!stack.empty() && arr[index] == stack.get(stack.size() - 1)) {
//                stack.pop();
//                sb.append("-").append("\n");
//                index++;
//            } else {
//                while(num <= N) {
//                    if(arr[index] != num) {
//                        stack.push(num);
//                        sb.append("+").append("\n");
//                        num++;
//                    }else{
//                        stack.push(num);
//                        sb.append("+").append("\n");
//                        num++;
//                        break;
//                    }
//                }
//            }
//
//        }

        if(index == N) {
            bw.write(String.valueOf(sb));

        }else {
            bw.write("NO");
        }

        bw.flush();
        bw.close();
    }
}
