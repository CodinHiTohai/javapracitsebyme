public class mhg {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addfirst(int data){
        Node newnode=new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public void addlast(int data){
        Node newnode=new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;
    }
    public void addmiddle(int data,int idx){
        if(idx==0){
            addfirst(data);
            return;
        }
        Node newnNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newnNode.next=temp.next;
        temp.next=newnNode;



    }
    public int removefirst(){
        if(head==null){
            System.out.println("the linklist is empty");
            return Integer.MIN_VALUE;

        }
        if(head==tail){
            int value=head.data;
            head=tail=null;
            size=0;
            return value;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    public int removelast(){
        if(size==0){
            System.out.println("the link list is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=tail.data;
        Node temp=head;
        int i=0;
        while(i<size-2){
            temp=temp.next;
            i++;
        }
        temp.next=null;
        tail=temp;
        size--;
        return val;
    }
    public int iterativesearch(int val){
        Node temp=head;
        int i=0;
        while(temp!=null){
        if(temp.data==val){
            return i;
        }
        temp=temp.next;
        i++;
        }
return -1;
    }
    public int helper(Node head,int val){
        if(head==null){
            return -1;
        
        }
        if(val==head.data){
            return 0;
        }
        int idx=helper(head.next, val);
        if(idx==-1){
            return -1;
        }return idx+1;

    }
    public void reverse(){
        Node prev=null;
        Node curr=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        

        }
        head=prev;
    }
    public void removefromlast(int n){
        int sz=0;
        Node temp=head;
        while(temp!=null){
            
            temp=temp.next;
            size++;
        }
        if(n==sz){
            head=head.next;
            return;
        }
        int i=1;
        int itofind=sz-n;
        Node prev=head;
        while(i<itofind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }
    // public Node findmid(Node head){
    //     Node slow=head;
    //     Node fast=head;
    //     while(fast!=null && fast.next!=null){
    //         slow=slow.next;
    //         fast=fast.next.next;
    //     }
    //     return slow;
    // }
    // public boolean checkpalindrone(){
    //     if(head==null || head.next==null){
    //         return true;
    //     }
    //     Node mid=findmid(head);
    //     Node prev=null;
    //     Node curr=mid;
    //     Node next;
    //     while(curr!=null){
    //         next=curr.next;
    //         curr.next=prev;
    //         prev=curr;
    //         curr=next;

    //     }
    //     Node right=prev;
    //     Node left=head;
    //     while(right!=null){
    //         if(left.data!=right.data){
    //             return false;

    //         }
    //         right=right.next;
    //         left=left.next;
    //     }
    //     return true;
    // }
    public static boolean iscycle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
                
            }
            
        }
        return false;
    }
    public static void removecycyle(){
        boolean cycle=false;
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
            }
        }
if(cycle==false){
    return ;

}
slow=head;
Node prev=null;
while(slow!=fast){
    prev=fast;
    slow=slow.next;
    fast=fast.next;
}
prev.next=null;
    }
    
    public Node findmid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public Node merge(Node head1,Node head2){
        Node mrgll=new Node(-1);
        Node temp=mrgll;
        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1!=null){
            temp.next=head1;
                head1=head1.next;
                temp=temp.next;
        }
        while (head2!=null) {
            temp.next=head2;
                head2=head2.next;
                temp=temp.next;
        }
        return mrgll.next;

    }
    public Node mergesort(Node head){
if(head==null|| head.next==null){
    return head;
}
        Node mid=findmid(head);
        Node righthead=mid.next;
        mid.next=null;
        Node newleft=mergesort(head);

        Node newright=mergesort(righthead);
        return merge(newleft,newright);
    }
    public static void main(String[] args) {
        mhg g=new mhg();
        g.addfirst(1);
        g.addfirst(2);
        g.addfirst(3);
        g.addfirst(4);
        g.addfirst(5);
        g.print();
        System.out.println();
    head = g.mergesort(head);
g.print();

    

        
        
    }
}
