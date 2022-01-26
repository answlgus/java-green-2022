package ex22;

import java.util.HashSet;
import java.util.Set;

public class CollectionEx02 {
    public static void main(String[] args) {
        Set<Integer> datas = new HashSet<>();
        datas.add(10);
        datas.add(20);
        datas.add(20);
        datas.add(40);

        datas.remove(10);

        System.out.println(datas.size()); // length X -> size
        System.out.println(datas);

        // Iterator<Integer> its =datas.iterator();
        // while(its.hasNext()){
        // System.out.println(its.next());
    }
}
// }
