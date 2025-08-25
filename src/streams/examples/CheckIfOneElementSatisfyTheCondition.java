package streams.examples;

import java.util.stream.IntStream;

public class CheckIfOneElementSatisfyTheCondition {

    public static void main(String[] args) {
        IntStream stream = IntStream.range(1, 14);

        System.out.println(stream.anyMatch(CheckIfOneElementSatisfyTheCondition::condition));
    }

    public static boolean condition(int a) {
        return a == 15;
    }
}
