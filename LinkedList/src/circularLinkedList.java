class CLL{
    int val;
    CLL next;

    CLL(int val){
        this.val = val;
    }
}
public class circularLinkedList {
    public static void main(String[] args) {
        CLL a = new CLL(10);
        CLL b = new CLL(20);
        CLL c = new CLL(30);

        a.next =b;
        b.next =c ;
        c.next =a;

        CLL temp = a;
        while(true){
            System.out.println(temp.val);
            if(temp.next == a) break;
            temp=temp.next;
        }
    }
}
