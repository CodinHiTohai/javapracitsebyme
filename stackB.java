import java.util.*;

public class stackB {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static  class stack{
        static Node head=null;
        public static boolean isempty(){
            return head==null;
        }
        public static void push(int data){
            Node newnode=new Node(data);
            if(isempty()){
                head=newnode;
                return;
            }
             newnode.next=head;
             head=newnode;
            
        }
        public static int pop(){
            if(isempty()){
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }
        public static int peek(){
            if(isempty()){
                return -1;

            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        while(!stack.isempty()){
System.out.println(stack.peek());
stack.pop();
        }
    }
}
