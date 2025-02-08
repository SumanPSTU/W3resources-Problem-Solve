package BasicPart_2;

public class problem_175 {
    private static int size = 0;
    private Node head;
    private Node tail;
    private static class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }
    void addFirst(int value){
        Node node = new Node(value);
        if (head == null){
            head = tail = node;
        }else{
            node.next = head;
            head = node;
        }
        size++;
        return;
    }
    void addLast(int value){
        Node node = new Node(value);
        if (head == null){
            head = tail = node;
        }else {
            tail.next = node;
            tail = node;
        }
        size++;
        return;
    }
    void deleteMiddle(){
        Node fast = head;
        Node slow = head;
        while (fast.next.next!=null && fast.next.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        size--;
        return;
    }
    void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
        System.out.println("End");
    }
    void insertAt(int index, int value){
        if (index<0 || index>size){
            throw new IndexOutOfBoundsException("Index out of bound");
        }
        if (index==0){
            addFirst(value);
            return;
        }
        if (index==size){
            addLast(value);
            return;
        }
        Node temp = head;
        for (int i = 1;i<index;i++){
            temp = temp.next;
        }
        Node node = new Node(value);
        node.next = temp.next;
        temp.next = node;
        size++;
        return;
    }
    public static void main(String[] args){
        problem_175 list = new problem_175();
        list.addLast(45);
        list.addLast(90);
        list.insertAt(1,500);
        list.insertAt(2,800);
        list.addLast(70);
        list.display();
        list.deleteMiddle();
        list.display();
    }
}
