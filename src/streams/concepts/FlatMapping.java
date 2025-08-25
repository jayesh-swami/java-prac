package streams.concepts;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapping {

    private static class MyObj {
        public List<Integer> myList;

        MyObj() {
            myList = new ArrayList<>(List.of(1, 2, 3, 4));
        }
    }

    public static void main(String[] args) {

        Stream<MyObj> myObjStream = Stream.of(
                new MyObj(),
                new MyObj(),
                new MyObj()
        );

        LinkedList<Integer> list = myObjStream
                .flatMap(myObj -> myObj.myList.stream())
                .collect(LinkedListCollector.toLinkedList());

        list.add(2);

        System.out.println(list.getClass());
    }
}
