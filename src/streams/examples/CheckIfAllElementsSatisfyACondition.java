package streams.examples;

import java.util.stream.IntStream;

public class CheckIfAllElementsSatisfyACondition {

    public static void main(String[] args) {
        IntStream stream = IntStream.range(1, 17);

        System.out.println(stream.allMatch(CheckIfAllElementsSatisfyACondition::condition));
    }

    public static boolean condition(int a) {
        return a < 15;
    }
}
