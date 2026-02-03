public class second {
    static class queu{
        static int arr[];
        static int size;
        static int rear;
        static int front;
        queu(int n){
            arr=new int[n];
            size=n;
            rear=-1;
            front=-1;

        }
        public static boolean isEmpty(){
            return rear==-1 && front==-1;

        }
        public static void add(int data){
            if((rear+1)%size==front){
                System.out.println("the queu is full");
                return ;
            }
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("the queu is empty");
                return -1;
            }
            int result=arr[front];
            if(rear==front){
                front=rear=-1;
            }
            else{
                front=(front+1)%size;
            }
            return result;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("the queu is empty" );
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        
    }
}
