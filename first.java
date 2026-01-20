

public class first {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node (int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
        public static Node head;
        public static Node tail;
        public static int size;
    
    public  void addfirst(int data){
        Node newnode=new Node(data);
        size++;
        if(head==null){
head=tail=newnode;
return;
        }
        newnode.next=head;
        head.prev=newnode;
        head=newnode;
    
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public int removefirst(){
        if(head==null){
            return Integer.MIN_VALUE;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
return val;
    }
    public void addlast(int data){
        
        Node newnode=new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
        }

        tail.next=newnode;
        newnode.prev=tail;
        tail=newnode;

        

    }
    public int removelast(){
        if(head==null){
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }else{
        int val=tail.data;
        tail=tail.prev;
        tail.next=null;
        size--;
        return val;
    }
}
public void reverse(){
    Node curr=head;
    Node prev=null;
    Node next;
    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        curr.prev=next;
        prev=curr;
        curr=next;
    }
     head=prev;
}
    public static void main(String[] args) {
        first dl=new first();
        dl.addfirst(5);
        dl.addfirst(4);
        dl.addfirst(3);
        dl.addfirst(2);
        dl.addfirst(1);
        dl.addlast(99);
        
        //System.out.println(size);
    
        dl.print();
        dl.reverse();
        dl.print();
        //System.out.println(size);
    }
}
