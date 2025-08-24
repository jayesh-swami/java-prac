package streams.examples;

import java.util.List;

public class CountLengthOfStringsGreaterThan {

    public void solution(List<String> strings) {
        System.out.println(
                strings.stream()
                        .filter(string -> string.length() > 5)
                        .count()
        );
    }
}
