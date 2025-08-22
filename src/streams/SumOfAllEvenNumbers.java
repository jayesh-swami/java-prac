package streams;

import java.util.List;

public class SumOfAllEvenNumbers {

    public int solution(List<Integer> nums) {

        return nums.stream()
                .filter(num -> num % 2 == 1)
                .mapToInt(Integer::intValue)
                .sum();
    }
}
