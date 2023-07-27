// Insertation FIrst NOde in Singly Linked List

public class SInglyLinkedList {
    public static void main(String[] args) {
        SInglyLinkedList obj = new SInglyLinkedList();
        obj.InsertFirst(18);
        obj.InsertFirst(7);
        obj.InsertFirst(8);
        obj.InsertFirst(5);
        obj.Print();

    }
    Node head;
    class Node{
        int data;
        Node Next;
        public Node(int data){
            this.data = data;
            this.Next = null;
        }
    }
    public void InsertFirst(int data){
        Node N1 = new Node(data);
        if (head == null) {
            head = N1;
            return;
        }
        else {
            N1.Next = head;
            head = N1;
        }
    }
    public void Print(){
        Node Pointer = head;
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        while (Pointer.Next != null){

            System.out.print(Pointer.data+"->");
            Pointer = Pointer.Next;
        }
        System.out.println("Null");
    }
}
