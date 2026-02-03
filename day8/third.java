

public class third {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
        static class queu{
        static int size;
        static Node head=null;
        static Node tail=null;
        public static boolean isEmpty(){
            return head==null && tail ==null;
        }
        public static void add(int data){
            Node newnode=new Node(data);
            if(head==null){
                head=tail=newnode;
                return;
            }
            tail.next=newnode;
            tail=newnode;


        }
public static int remove(){
    if(isEmpty()){
        System.out.println("the queu is empty");
        return -1;
    }
    int front=head.data;
    if(head==tail){
head=tail=null;
    }else{
    head=head.next;
    }
    return front;
}
public static int peek(){
    if(isEmpty()){
        System.out.println("the queu is emptye");
        return -1;
    }
    return head.data;
}

        }
    
    public static void main(String[] args) {
    queu q=new queu();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    while(!q.isEmpty()){
        System.out.println(q.peek());
        q.remove();
    }
    }
}
