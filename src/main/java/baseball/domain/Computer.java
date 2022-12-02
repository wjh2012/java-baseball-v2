package baseball.domain;

import java.util.List;

public class Computer {

    private final List<Integer> numbers;

    public Computer(List<Integer> numbers) {
        this.numbers = numbers;
    }

    private boolean compareValue(int value, int index) {
        return numbers.get(index) == value;
    }

}
