import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Task5 {
    public static <T> String zip(Stream<T> first, Stream<T> second) {
        Iterator<T> iterFirst = first.iterator();
        Iterator<T> iterSecond = second.iterator();

        List<String> result = new ArrayList<>();
        while (iterFirst.hasNext() && iterSecond.hasNext()) {
            result.add(iterFirst.next().toString());
            result.add(iterSecond.next().toString());
        }

        return String.join(", ", result);
    }

    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("a", "b", "c");
        Stream<String> stream2 = Stream.of("x", "y", "z");

        String zippedResult = zip(stream1, stream2);
        System.out.println(zippedResult);
    }
}