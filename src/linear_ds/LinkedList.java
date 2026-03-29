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

    public boolean contains(int item){
        return indexOf(item) >= 0;
    }

    public void removeFirst(){
        if(head == null)
            return;

        if (head == tail){
            head = null;
            tail = null;
            return;
        }

        var temp = head.next;
        head.next = null;
        head = temp;
        count--;
    }

    public void removeLast(){
        if(head == null)
            return;

        if (head == tail){
            head = null;
            tail = null;
            return;
        }

        var current = head;

        while (current.next != tail){
            current = current.next;
        }

        current.next = null;
        tail = current;
        count--;
    }

    public int size(){
        return count;
    }

    public int[] toArrays(){
        var current = head;

        int[] nums = new int[count];
        int index = 0;
        while (current != null){
            nums[index++] = current.value;
            current = current.next;
        }

        return nums;
    }

    public void reverse(){
        if(head == null)
            return;

        var prev = head;
        var curr = head.next;

        while (curr != null){
           var temp = curr.next;
           curr.next = prev;
           prev = curr;
           curr = temp;
        }

        tail = head;
        head = prev;
        tail.next = null;
    }

    public int getNthFromEnd(int n){
        if(n > count)
            throw new IllegalArgumentException();

        var a = head;
        var b = head;

        for(int i = 0; i<n-1; i++){
            b = b.next;
        }

        while (b != tail){
            a = a.next;
            b = b.next;
        }

        return a.value;
    }
}
