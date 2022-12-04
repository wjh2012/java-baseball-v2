package baseball.domain;

import baseball.BaseBallRandomNumberGenerator;
import java.util.Arrays;
import java.util.List;

public class BaseBallGame {

    private NumberMaker numberMaker;
    private Computer computer;

    public BaseBallGame() {
        numberMaker = new NumberMaker(new BaseBallRandomNumberGenerator());
        computer = new Computer(numberMaker.makeNumbers());
    }

    public List<Integer> guess(List<Integer> numbers) {
        int ball = 0;
        int strike = 0;

        for (int i = 0; i < 3; i++) {
            int value = numbers.get(i);
            if (computer.hasValue(value)) {
                if (computer.compareValue(i, value)) {
                    strike += 1;
                    continue;
                }
                ball += 1;
            }
        }
        return Arrays.asList(ball, strike);
    }
}
