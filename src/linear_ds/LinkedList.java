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

    public void addFirst(int item){
        var node = new Node(item);
        if(head == null){
            head = tail = node;
        } else {
            node.next = head;
            head = node;
        }
        count++;
    }

    public int indexOf(int item){
        var current = head;
        int index = 0;

        while (current != null){
            if(current.value == item)
                return index;
            current = current.next;
            index++;
        }

        return -1;
    }
}
