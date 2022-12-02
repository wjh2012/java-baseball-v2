package baseball.domain;

import java.util.List;

public class Computer {

    private final List<Integer> numbers;

    public Computer(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public boolean hasValue(int value) {
        return numbers.contains(value);
    }

    public boolean compareValue(int index, int value) {
        return numbers.get(index) == value;
    }
}
