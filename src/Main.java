import linear_ds.ArrayList;
import linear_ds.LinkedList;

public class Main{
    public static void main(String [] args) {
        var list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addLast(60);
        list.addFirst(5);

        list.removeFirst();
        list.removeLast();

        System.out.println("done");
    }
}

