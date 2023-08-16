package class2;

import java.io.*;
import java.util.StringTokenizer;

public class q10845 {

    public static int[] queue;
    public static int size = 0;
//    public static int front = 0; // pop 할 위치
    public static int rear = -1;  // push 할 위치
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int count = Integer.parseInt(br.readLine());
        queue = new int[count];

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<count; i++){
            st = new StringTokenizer(br.readLine());

            String order = st.nextToken();
            if(order.equals("push")){
                push(Integer.parseInt(st.nextToken()));
            }
            if(order.equals("pop")){
                sb.append(pop()).append('\n');
            }
            if(order.equals("size")) {
                sb.append(size()).append('\n');
            }
            if(order.equals("empty")){
                sb.append(empty()).append('\n');
            }
            if(order.equals("front")){
                sb.append(front()).append('\n');
            }
            if(order.equals("back")){
                sb.append(back()).append('\n');
            }
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();

    }

    public static void push(int num){
        rear++;
        queue[rear] = num;
    }

    public static int pop(){
        if(rear < 0) return -1;
        else{
            int result = queue[0];
            int tmp;
            for(int j = 0; j < rear; j++) {
//                tmp = queue[j];
//                queue[j - 1] = tmp;
//                queue[j] = 0;
                queue[j]=queue[j+1];
            }
            rear--;
            return result;
        }
    }

    public static int size(){
        if(rear<0) return 0;
        return rear+1;
    }

    public static int empty(){
        if(rear == -1) return 1;
        else return 0;
    }

    public static int front(){
        if(empty() == 1) {
            return -1;
        } else return queue[0];
    }

    public static int back(){
        if(empty() == 1 || rear == -1) {
            return -1;
        } else return queue[rear];
    }
}
