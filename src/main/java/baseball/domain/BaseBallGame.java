package baseball.domain;

import static baseball.domain.ScoreResult.*;

import baseball.BaseBallRandomNumberGenerator;
import java.util.ArrayList;
import java.util.List;

public class BaseBallGame {

    private NumberMaker numberMaker;
    private Computer computer;

    public BaseBallGame() {
        numberMaker = new NumberMaker(new BaseBallRandomNumberGenerator());
        computer = new Computer(numberMaker.makeNumbers());
    }

    public List<ScoreResult> guess(List<Integer> numbers) {
        List<ScoreResult> scoreResults = new ArrayList<>();

        numbers.forEach(number -> scoreResults.add(
                judgeNumber(numbers.indexOf(number), number)));

        return scoreResults;
    }

    private ScoreResult judgeNumber(int index, int value) {
        if (computer.hasValue(value)) {
            return judgeBallAndStrike(index, value);
        }
        return NONE;
    }

    private ScoreResult judgeBallAndStrike(int index, int value) {
        if (computer.compareValue(index, value)) {
            return STRIKE;
        }
        return BALL;
    }
}
