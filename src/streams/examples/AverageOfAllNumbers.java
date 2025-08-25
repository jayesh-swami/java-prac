package streams.examples;

import java.util.stream.IntStream;

public class AverageOfAllNumbers {

    public static void main(String[] args) {
        IntStream stream = IntStream.range(1, 2);

        System.out.println(stream.average().getAsDouble());
    }
}
