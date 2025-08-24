package streams.concepts;

import java.util.Arrays;

public class StreamReduce {

    public static void main(String[] args) {

        System.out.println(Arrays.asList(1, 2, 3).parallelStream()
                .reduce(10, Integer::sum, Integer::sum));
    }
}
