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
    Node head;   // declaring head is one of the Node
    class Node{   // creating a class for structure of node, a node contains two parts one is data and another one is next
        int data;
        Node Next;
        public Node(int data){
            this.data = data;   // data part containing  any data
            this.Next = null;   // Next part containing null
        }
    }
    public void InsertFirst(int data){ // method for Insert First Node in Singly Linked List

        Node N1 = new Node(data); // creating a new Node for insert
        // There will two condition for inserting a first node

        if (head == null) {  // may be List is empty

            head = N1;
            return;
        }
        else { // there is some node in singly linked list
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
