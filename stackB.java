import java.util.*;

public class stackB {
    static  class stack{
        static ArrayList<Integer>list=new ArrayList<>();
        public static boolean isempty(){
            return list.size()==0;
            }
        

    public static void push(int data){
        list.add(data);
    }
    public static int pop(){
        int top=list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }
    public static int peek(){
        return list.get(list.size()-1);
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
