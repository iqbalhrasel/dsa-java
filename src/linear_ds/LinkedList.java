package linear_ds;

public class LinkedList {
    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int count;

    public void addLast(int item){
        var node = new Node(item);

        if(head == null){
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        count++;
    }
}
