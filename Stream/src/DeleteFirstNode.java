public class DeleteFirstNode {

    Node head;
    class Node{
        int data;
        Node Next;
        public Node(int value){
            this.data = value;
            this.Next =null;
        }
    }

    public void InsertNode(int value){
        Node n1 = new Node(value);
        if (head == null) {
            head  = n1;
            return;
        }
        n1.Next = head;
        head = n1;

    }


    public void FirstNode(){
        if (head == null) {
            System.out.print("This list is empty");
            return;
        }
        head = head.Next;
    }

    public void Print(){
        if (head == null) {
            System.out.print("List is empty");
            return;
        }
        Node Pointer = head;
         while (Pointer != null){
             System.out.print(Pointer.data + "->");
             Pointer = Pointer.Next;
         }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        DeleteFirstNode obj = new DeleteFirstNode();
        obj.InsertNode(1);
        obj.InsertNode(2);
        obj.InsertNode(3);
        obj.InsertNode(4);
        obj.InsertNode(5);
        obj.InsertNode(6);
        obj.FirstNode();
         obj.Print();
    }

}

