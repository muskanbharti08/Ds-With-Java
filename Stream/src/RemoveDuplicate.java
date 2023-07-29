public class RemoveDuplicate {
    Node head;
    class Node{
        int data;
        Node Next;
        public Node(int value){
            this.data  = value;
            this.Next = null;
        }
    }
    public void Insertfirst(int value){
        Node nn = new Node(value);
        if (head == null) {
            head = nn;
            return;
        }
        nn.Next = head;
        head = nn;
    }  // code for insertion of nodes at first

    public void Print(){
        if (head == null){
            System.out.println("This list is empty ");
            return;
        }
        Node Pn = head;
        while (Pn != null){
            System.out.print(Pn.data + "->");
            Pn = Pn.Next;
        }
        System.out.println("Null");
    }                // Code for Print

    public static void main(String[] args) {
        RemoveDuplicate obj = new RemoveDuplicate();
        obj.Insertfirst(5);
        obj.Insertfirst(5);
        obj.Insertfirst(4);
        obj.Insertfirst(3);
        obj.Insertfirst(3);
        obj.Insertfirst(2);
        obj.Insertfirst(1);
        obj.Insertfirst(1);
        obj.Print();
        System.out.println("After Remove Duplicate Node");
        obj.Duplicate();
        obj.Print();
    }

    public void Duplicate(){
        Node current = head;
        while (current != null && current.Next != null){
            if (current.data == current.Next.data) {
                current.Next = current.Next.Next;
            }
            current = current.Next;
        }

    }           // Code For Remove Duplicate Node from Sorted singly linked list
}
