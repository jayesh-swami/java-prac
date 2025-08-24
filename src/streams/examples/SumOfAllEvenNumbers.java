package streams.examples;

import java.util.List;

public class SumOfAllEvenNumbers {

    public int solution(List<Integer> nums) {

        return nums.stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
    }
}
