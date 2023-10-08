import java.util.List;

public class Task2 {

        public static void main(String[] args) {
            List<String> stringName = List.of("Ivan", "Peter", "Mary", "John", "Sara", "Liza");
            stringListProcessor(stringName);
        }

        public static void stringListProcessor(List<String> stringName){
            stringName.stream()
                    .map(s->s.toUpperCase())
                    .sorted((s1, s2) -> s2.compareTo(s1))
                    .forEach(s -> System.out.print(s + ", "));
        }


}
