import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HelloMain {

    @Test
    public void test(){
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator iterable = list.iterator();
        while (iterable.hasNext()){
            int a = (int) iterable.next();
            if (a == 1) iterable.remove();
        }
        System.out.println(list.size());
    }
}
