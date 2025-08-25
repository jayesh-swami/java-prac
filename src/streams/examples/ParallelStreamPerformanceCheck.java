package streams.examples;

import java.util.stream.IntStream;

public class ParallelStreamPerformanceCheck {

    public static void main(String[] args) {
        IntStream stream = IntStream.range(1, 100000000);

        System.out.println(stream.parallel().map(a -> a + 1).sum());
    }
}
