package practice.collection;

import java.util.*;

public class Ex0 {
    public static void main(String[] args) {

    Integer[] arr = {3, 5, 1, 2, 3};
    List list = new ArrayList(Arrays.asList(arr));
    TreeSet ts = new TreeSet(list);
    Iterator it = ts.iterator();
        while (it.hasNext()){

            System.out.println(it.next());
        }
    }
}
