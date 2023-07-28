public class InsertLastNode {
    Node head; // Declares Head is Node

    class Node{
        int data;
        Node Next;
        public Node(int value){
            this.data = value; //  contains any value
            this.Next = null;  // Next Contains Null
        }
    }


    public void LastNode(int value){ // Method for Insert Node at Last
        Node N1 = new Node(value);   // Creating a New Node

        // There will some conditions

         if( head == null){     // List  is empty
             head = N1;
             return;
         }
         Node Pointer = head;

         while(Pointer.Next != null){  // There are some node in singly linked list

             Pointer = Pointer.Next;
         }
        Pointer.Next = N1;
    }

    public  void Print(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node Pointer = head;
        while (Pointer!= null){
            System.out.print(Pointer.data +"->");
            Pointer = Pointer.Next;
        }
        System.out.println("Null");
        return;

    }

    public static void main(String[] args) {
        InsertLastNode obj = new InsertLastNode();
        obj.LastNode(23);
        obj.LastNode(93);
        obj.LastNode(3);
        obj.LastNode(2);
        obj.Print();

    }
}
