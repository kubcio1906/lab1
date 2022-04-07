import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class zad1dodatkowe {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);

        linkedList.add(10);
        linkedList.add(11);
        linkedList.add(12);
        linkedList.add(13);
        linkedList.add(14);
        linkedList.add(15);
        linkedList.add(16);

        Iterator<Integer> iterator = arrayList.iterator();
        Iterator<Integer> iterator2 = linkedList.iterator();


        for (int i = 0; iterator.hasNext(); i++) {
            iterator.next();
            if (i % 2 != 0) {
                iterator.remove();

            }
        }

        for (int a : arrayList
        ) {
            System.out.println(a);
        }

        for (int i = 0; iterator2.hasNext(); i++) {
            iterator2.next();
            if (i % 2 != 0) {
                iterator2.remove();

            }
            for (int a : linkedList
            ) {
                System.out.println(a);
            }




        }
    }
}
