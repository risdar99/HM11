import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Task5 {

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> filteredList = Stream.concat(first, second)
                .filter(Objects::nonNull)
                .collect(Collectors.toList());

        return filteredList.stream();
    }

    public static void main(String[] args) {
        Stream<Integer> firstStream = Stream.of(1, 2, 3, 4);
        Stream<Integer> secondStream = Stream.of(5, 6, 7, 8, 9);

        String result = zip(firstStream, secondStream)
                .map(Object::toString)
                .collect(Collectors.joining(", "));
        System.out.println(result);
    }
}