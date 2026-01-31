import java.util.*;

public class third {
    public static void pushatbottom(Stack<Integer>s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;

        }

        int top=s.pop();
        pushatbottom(s, data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        pushatbottom(s, 88);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
