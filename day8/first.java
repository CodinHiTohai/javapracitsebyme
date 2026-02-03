// import java.util.Queue;

// public class first {
//     static class queu{
//         static int arr[];
//         static int size;
//         static int rear;
//          queu(int n){
//             arr=new int[n];
//             size=n;
// rear=-1;
//          }
//          public static boolean isEmpty(){
//             return rear==-1;
//          }
//          public static void add(int data){
//             if(rear==size-1){
//                 System.out.println("the queu is full");
//                 return;
//             }
//             rear=rear+1;
//             arr[rear]=data;

//          }
//          public static int remove(){
//             if(isEmpty()){
//                 System.out.println("the queu is empty");
//                 return -1;

//             }
//             int front=arr[0];
//             for(int i=0;i<rear;i++){
//                 arr[i]=arr[i+1];
//             }
//             rear=rear-1;
//             return front;
//          }
// public static int peek(){
//     if(isEmpty()){
//         System.out.println("the queu is empty");
//         return -1;

//     }
//     return arr[0];
// }
//     }
//     public static void main(String[] args) {
//     queu q=new queu(5);
//     q.add(1);
//     q.add(2);
//     q.add(3);
//     q.add(4);
//     q.add(5);
//     while(!q.isEmpty()){
//         System.out.println(q.peek());
//         q.remove();
//     }
//     }
// }
public class first{
    static class queu{
        static int arr[];
        static int size;
        static int rear;
        queu(int n){
            arr=new int[n];
            size=n;
            rear=-1;

        }
        public static boolean isEmpty(){
            return rear==-1;

        }
        public static void add(int data){
            if(rear==size-1){
                System.out.println("the queu is full");
                return;
            }
            rear=rear+1;
            arr[rear]=data;

        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("the queu is empty");
                return -1;
            }
            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear=rear-1;
            return front;
        }
        public static int peek(){
        if(isEmpty()){
            System.out.println("the queu is empty");
            return -1;
        }
        return  arr[0];
        }
    }
    public static void main(String[] args) {
        queu q=new queu(5);
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
