public class middleOfLinkedList {
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);
        a.next =b;
        b.next=c;
        c.next=d;
        d.next=e;

        int size=0;
        Node temp =a;
        while(temp != null){
            size++;
            temp=temp.next;
        }
        System.out.println("size is:"+size);

        int mid = (size/2)+1;
        System.out.println("middle index is:"+mid);

        Node x = a;
        for(int i=1 ; i<mid ;i++){
            x=x.next;
        }
        System.out.println(x.val);

    }
}
