import java.util.*;

public class reversestring {
    public static String reverse(String str){
        Stack<Character>s=new Stack<>();
        for(int i=0;i<str.length();i++){
            s.push(str.charAt(i));
        }
StringBuilder sb=new StringBuilder();
while(!s.isEmpty()){
    char curr=s.pop();
    sb.append(curr);
}
return sb.toString();
    }
    public static void main(String[] args) {
        String str="abc";
        String result=reverse(str);
        System.out.println(result);
    }
}
