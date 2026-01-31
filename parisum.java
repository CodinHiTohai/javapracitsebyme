import java.util.ArrayList;

public class parisum {
    public static boolean pirsum(ArrayList<Integer>list,int tearget){
        int start=0;
        int end=list.size()-1;
        while(start<end){
            
            if(list.get(start)+list.get(end)==tearget){
                return true;
            }
            if(list.get(start)+list.get(end)>tearget){
            end--;
        }else{
            start++;
        }
    }

        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int tearget=5;
        System.out.println(pirsum(list, tearget));
    }
}
