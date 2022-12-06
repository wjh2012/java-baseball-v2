package baseball.domain;

import baseball.BaseBallNumberGenerator;
import java.util.ArrayList;
import java.util.List;

public class NumberMaker {

    private static final int NUMBER_SIZE = 3;

    private final BaseBallNumberGenerator baseBallNumberGenerator;

    public NumberMaker(BaseBallNumberGenerator baseBallNumberGenerator) {
        this.baseBallNumberGenerator = baseBallNumberGenerator;
    }

    public List<Integer> makeNumbers() {
        List<Integer> numbers = new ArrayList<>();
        while (numbers.size() < NUMBER_SIZE) {
            int randomNumber = baseBallNumberGenerator.generate();
            if (!numbers.contains(randomNumber)) {
                numbers.add(randomNumber);
            }
        }
        return numbers;
    }
}
