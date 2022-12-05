package baseball.domain;

import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BaseBallGameTest {

    @DisplayName("숫자를 비교한 후, BALL, STRIKE, NONE 리스트로 반환")
    @Test
    void guess() {
        BaseBallGame baseBallGame = new BaseBallGame();
        List<ScoreResult> result = baseBallGame.guess(List.of(1,2,3));

        Assertions.assertThat(ScoreResult.values()).contains(result.get(0));
    }
}