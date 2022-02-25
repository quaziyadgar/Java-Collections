import java.util.*;

/**
 * Collection
 */
public class Collection {

    public static void main(String[] args) {
        List<Integer> li = new ArrayList<Integer>();
        li.add(5);
        li.add(7);
        li.add(79);
        li.add(52);
        
        for(int i : li)
        System.out.println(i);
    }
}