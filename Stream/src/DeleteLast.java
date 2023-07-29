public class DeleteLast {
    Node head;
    class  Node {
        int data;
        Node Next;

        public Node(int value) {
            this.data = value;
            this.Next = null;
        }
    }

         public void InsertNode(int value){
             Node N = new Node(value);
             if (head == null) {
                  head =  N;
                  return;
             }
             N.Next = head;
              head = N;
         }

         public  void  DeleteLast(){

              if(head == null ){
            System.out.println( " This list is empty");
             return;
         }
             if (head.Next == null) {
                 head = null;
                 return;
             }
             Node Pointer= head;
             while (Pointer.Next.Next != null){
                 Pointer = Pointer.Next;
             }
             Pointer.Next = null;
         }

         public void Print(){
             if (head == null) {
                 System.out.println("The List is empty");
                 return;
             }
             Node P = head;
             while(P != null){
                 System.out.print(P.data+"->");
                    P = P.Next;
             }
             System.out.println("Null");
         }

    public static void main(String[] args) {
        DeleteLast obj = new DeleteLast();
        obj.InsertNode(6);
        obj.InsertNode(5);
        obj.InsertNode(4);
        obj.InsertNode(3);
        obj.InsertNode(2);
        obj.InsertNode(1);
        obj.Print();
        System.out.println("After deleted the last Node ");
        obj.DeleteLast();
        obj.Print();
    }



    }


