

import java.util.Arrays;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args){
        String[] inputArray = {"1, 2, 0", "4, 5"};
        String sortedNumbers = sortAndJoinNumbers(inputArray);
        System.out.println(sortedNumbers);
    }

    public static String  sortAndJoinNumbers ( String[] inputArray){
        return Arrays.stream(inputArray)
                .flatMap(s -> Arrays.stream(s.split(",\\s*")))
                .map(s->s.trim())
                .map(s -> Integer.parseInt(s))
                .sorted()
                .map(s-> s.toString())
                .collect(Collectors.joining(", "));

    }


    }

