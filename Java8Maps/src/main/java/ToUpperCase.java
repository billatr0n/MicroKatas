import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

import static java.util.stream.Collectors.toList;

public class ToUpperCase {


    public static List<String> transform7(List<String> collection) {
        List<String> coll = new ArrayList<>();
        for (String element : collection) {
            coll.add(element.toUpperCase());
        }
        return coll;
    }
    public static List<String> transform(List<String> collection){
        return collection.stream().map(String::toUpperCase).collect(toList());
    }

}