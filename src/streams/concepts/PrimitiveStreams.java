package streams.concepts;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * To get rid of boxing/unboxing for native int/long/double called IntStream/LongStream/DoubleStream respectively
 */
public class PrimitiveStreams {

    public IntStream exampleInt() {
        IntStream test = Arrays.stream(new int[] {1, 2, 3, 4, 5, 6});

        return test;
    }
}
