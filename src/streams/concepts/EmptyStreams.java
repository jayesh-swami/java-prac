package streams.concepts;

import java.util.stream.Stream;

/**
 * An empty stream is equivalent of an empty list but for streams. We can choose to return this instead of null
 * when we want to indicate that there are no elements in the stream
 */
public class EmptyStreams {

    public Stream<Object> example() {

        return Stream.empty();

    }
}
