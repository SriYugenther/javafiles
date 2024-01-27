import java.util.*;

public class treesetcollection {
    public static void main(String args[]){
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("first");
        ts.add("second");
        ts.add("third");
        ts.add("fourth");
        ts.add("fifth");
        System.out.println(ts);
        Iterator<String> itr = ts.iterator();

        while(itr.hasNext())
            System.out.println(itr.next());
    }
}
