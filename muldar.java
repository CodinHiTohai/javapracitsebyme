import java.util.ArrayList;

public class muldar{
//     public static void find( ArrayList<Integer>list){
//         int max=Integer.MIN_VALUE;
//         for(int i=0;i<list.size();i++){
//             for(int j=i+1;j<list.size();j++){
//                 int height=Math.min(list.get(i), list.get(j));
//                 int width=j-i;
//                 int area=height*width;
//                 max=Math.max(area,max);
//             }
//         }
//         System.out.println(max);
//     }
public static void findmax(ArrayList<Integer>list){
    int max=Integer.MIN_VALUE;
    int start=0;
    int end=list.size()-1;
    while(start<end){
        int height=Math.min(list.get(start),list.get(end));
        int widht=end-start;
        int area=height*widht;
        max=Math.max(area,max);
        if(list.get(start)>list.get(end)){
            end--;
        }else{
            start++;
        }
    }
    System.out.println(max);
}
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
    findmax(list);
    }
}