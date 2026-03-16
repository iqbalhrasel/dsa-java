import linear_ds.ArrayList;

public class Main{
    public static void main(String [] args) {
        var list = new ArrayList(3);
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insert(60);
        list.insert(70);

        System.out.println(list);
    }
}

