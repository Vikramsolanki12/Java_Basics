class Node{
    int val;
    Node next;

    Node(int val){
        this.val = val;
    }
}
public class BasicLinkedList {
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);

        System.out.println(a);
        System.out.println(a.val);
        System.out.println(a.next);
    }
}
