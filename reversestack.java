import java.util.*;

public class reversestack {
    public void pushedatbotton(Stack<Integer>s,int data){
        if(s.isEmpty()){
            s.push(data);
        }
        int top=s.pop();
        pushedatbotton(s, data);
        s.push(top);
    }
    public static void reverse(Stack<Integer>s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverse(s);
        pushedatbotton(s, top);

    }
{

    



    
    }
    public static void main(String[] args) {
        
        Stack<Integer>s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        printStack(s);
        reverse(s);
        printStack(s);
    }
}
