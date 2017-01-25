import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * Created by bkandon7 on 01/23/2017.
 */
public interface EightFeatures {

    private String concat(ArrayList<String> items)
    {
        for (int i = 0; i < items.size(); i++)
        {
            String s += item(i) + ", ";
        }
        return s;
    }

    private Foo toFoo(String s)
    {
        String id, name, secretKey = "";
        String[] keyItems = s.split("|");
        id = keyItems[0];
        name = keyItems[1];
        secretKey = keyItems[2];
        Foo f = new Foo(id, name, secretKey);
        return f;
    }

    String[] sort(ArrayList<String> unsortedList)
    {

    }

    Stream<String> streamLines()
    {
        list.stream();
    }

    Stream<Foo> getFoos()
    {
        fooList.stream();
    }
}
