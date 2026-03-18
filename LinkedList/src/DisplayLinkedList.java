public class DisplayLinkedList {
    public  static void Display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node (30);
        a.next = b;
        b.next = c;

        Display(a);
    }
}
