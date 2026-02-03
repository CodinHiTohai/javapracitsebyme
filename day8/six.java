import java.util.*;
public class six {
    public static void interleaves(Queue<Integer>q){
        Queue<Integer>firsthalves=new LinkedList<>();
        int size=q.size();
        for(int i=0;i<size/2;i++){
            firsthalves.add(q.remove());
        }
        while(!firsthalves.isEmpty()){
            q.add(firsthalves.remove());
            q.add(q.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        interleaves(q);
        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}
