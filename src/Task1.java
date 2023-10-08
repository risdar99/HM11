import java.util.List;
import java.util.stream.IntStream;

public class Task1 {
    public static void main(String[] args) {
        List<String> stringName = List.of("Ivan", "Peter", "Mary", "John", "Sara", "Liza");
        generateNumberNames(stringName);
    }

    public static void generateNumberNames(List<String> stringName) {
        IntStream.range(0, stringName.size())
                .filter(i -> i % 2 == 0)
                .mapToObj(i -> (i + 1) + ". " + stringName.get(i))
                .forEach(s -> System.out.println(s));
    }
}