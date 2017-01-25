import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * Created by bkandon7 on 01/23/2017.
 */
public class EightFeaturesImpl implements EightFeatures {

    public String[] sort(ArrayList<String> unsortedList)
    {
        return Collections.sort(unsortedList);
    }

    public Stream<String> streamLines()
    {
        String[] s = {"1|Rocky|ThisIsMySecret", "2|Bullwinkle|IamASecret", "3|Bond|007", "8738ad77-fee1-4e58-8a98-2254bace9423|Hannah|IamAPalindome"};
        stream = s.stream();
    }

    public Stream<Foo> getFoos()
    {
        Stream<Foo> foos = new Stream.empty();
        Stream<String> s = new Stream.empty();
        String[] makeAFoo = s.streamLines().toArray();
        for (String item : s)
        {
            foos.add(toFoo(item));
        }
        return foos;
    }
}
