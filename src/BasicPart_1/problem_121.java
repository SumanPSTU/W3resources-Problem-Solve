package BasicPart_1;

public class problem_121 {
    public static void display(Node head){
        if (head ==null)return;
        System.out.print(head.data+"->");
        display(head.next);
    }
    public static void displayRev(Node node){
        Node temp = node;
        if (temp==null) return;
        displayRev(temp.next);
        System.out.print(temp.data+"->");

    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(20);
        Node b = new Node(40);
        Node c = new Node(60);
        Node d = new Node(80);
        a.next = b;
        b.next = c;
        c.next = d;
        System.out.println("First linked list");
        display(a);
        System.out.println();
        System.out.println("Reverse linked list");
        displayRev(a);
    }
}
