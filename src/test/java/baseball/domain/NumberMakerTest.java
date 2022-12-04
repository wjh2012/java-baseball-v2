package baseball.domain;

import baseball.BaseBallRandomNumberGenerator;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NumberMakerTest {

    @DisplayName("3자리 수를 생성하는지 테스트")
    @Test
    void makeThreeNumbers() {
        NumberMaker numberMaker = new NumberMaker(new BaseBallRandomNumberGenerator());
        List<Integer> result = numberMaker.makeNumbers();

        Assertions.assertThat(result.size()).isEqualTo(3);
    }

    @DisplayName("3자리 수가 모두 다른지 테스트")
    @Test
    void makeThreeRandomNumbers() {
        NumberMaker numberMaker = new NumberMaker(new BaseBallRandomNumberGenerator());
        List<Integer> numbers = numberMaker.makeNumbers();

        int result = (int) numbers.stream().distinct().count();

        Assertions.assertThat(result).isEqualTo(3);
    }
}