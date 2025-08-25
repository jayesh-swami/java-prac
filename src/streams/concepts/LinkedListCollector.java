package streams.concepts;

import java.util.LinkedList;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class LinkedListCollector<T> implements Collector<T, LinkedList<T>, LinkedList<T>> {

    @Override
    public Supplier<LinkedList<T>> supplier() {
        return LinkedList::new;
    }

    @Override
    public BiConsumer<LinkedList<T>, T> accumulator() {
        return LinkedList::add;
    }

    @Override
    public BinaryOperator<LinkedList<T>> combiner() {
        return (left, right) -> { left.addAll(right); return left; };
    }

    @Override
    public Function<LinkedList<T>, LinkedList<T>> finisher() {
        return Function.identity();
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Set.of();
    }

    public static <T> LinkedListCollector<T> toLinkedList() {
        return new LinkedListCollector<>();
    }
}
