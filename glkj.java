import java.util.ArrayList;
import java.util.Collections;

public class glkj {
    public static void findmax(ArrayList<Integer>list,int idx1,int idx2){
        int temp=list.get(idx2);
        list.set(idx2,list.get(idx1));
        list.set(idx1,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        // System.out.println(list.set(2, 9));
        // System.out.println(list.contains(9));
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}