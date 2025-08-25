package streams.concepts;

import java.util.*;
import java.util.stream.Collectors;

public class GroupingByCollector {

    record Tuple (
        BlogPostType type,
        String author
    ) {}

    record BlogPost(
        String title,
        String author,
        BlogPostType type,
        int likes
    ) {}

    enum BlogPostType {
        NEWS,
        REVIEW,
        GUIDE
    }

    static List<BlogPost> posts = List.of(
            new BlogPost("t1", "a1", BlogPostType.NEWS, 200),
            new BlogPost("t4", "a1", BlogPostType.REVIEW, 150),
            new BlogPost("t2", "a2", BlogPostType.REVIEW, 50),
            new BlogPost("t3", "a3", BlogPostType.GUIDE, 1)
    );

    public static void main(String[] args) {
        Map<String, Integer> groupedByType =
                posts.stream()
                .collect(
                        Collectors.groupingBy(
                                BlogPost::author,
                                Collectors.collectingAndThen(
                                        Collectors.toList(),
                                        list -> list.stream().mapToInt(BlogPost::likes).sum() + 100)
                                ));

        System.out.println(groupedByType);
    }


}
