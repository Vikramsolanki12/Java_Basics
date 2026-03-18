public class LinkingOfNodes {
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);

        a.next =b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        System.out.println(a.val);
        System.out.println(a.next.val);
        System.out.println(a.next.next.val);
        System.out.println(a.next.next.next.val);
        System.out.println(a.next.next.next.next.val);
        System.out.println(a.next.next.next.next.next.val);
        System.out.println(a.next.next.next.next.next.next);
    }
}
