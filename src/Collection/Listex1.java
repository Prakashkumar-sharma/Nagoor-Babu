package Collection;

import java.util.ArrayList;

public class Listex1 {
    public static void main(String[] args) {
        ArrayList i = new ArrayList();
        i.add("A");
        i.add(10);
        i.add("A");
        i.add(null);
        System.out.println(i);
        i.remove(2);
        System.out.println(i);
        i.add(2,"M");
        System.out.println(i);
        i.add("N");
        System.out.println(i);

    }
}
