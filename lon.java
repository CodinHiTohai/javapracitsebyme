import java.util.*;
public class lon {
    public static void lonelynum(ArrayList<Integer>list){
        Collections.sort(list);
        ArrayList<Integer>same=new ArrayList<>();
        int n=list.size();
        for(int i=0;i<list.size();i++){
            if((i==0||list.get(i)-list.get(i-1)>1)&&(i==n-1||list.get(i+1)-list.get(i)>1)){
                same.add(list.get(i));
            }
        }
System.out.println(same);
    }
   public static void main(String[] args) {
    ArrayList<Integer>list=new ArrayList<>();
    list.add(10);
    list.add(6);
    list.add(5);
    list.add(8);
    lonelynum(list);
   } 
}
