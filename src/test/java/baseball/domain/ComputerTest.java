package baseball.domain;

import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ComputerTest {

    @DisplayName("컴퓨터가 값을 가지고 있다면 참")
    @Test
    void hasValue() {
        Computer computer = new Computer(List.of(1,2,3));
        boolean result = computer.hasValue(3);

        Assertions.assertThat(result).isTrue();
    }

    @DisplayName("컴퓨터가 값가지고 있지 않다면 거짓")
    @Test
    void hasNotValue() {
        Computer computer = new Computer(List.of(1,2,3));
        boolean result = computer.hasValue(4);

        Assertions.assertThat(result).isFalse();
    }

    @DisplayName("정확한 위치에 값을 가지고 있다면 참")
    @Test
    void hasValueAndLocation() {
        Computer computer = new Computer(List.of(1,2,3));
        boolean result = computer.hasValueAndLocation(1,2);

        Assertions.assertThat(result).isTrue();
    }

    @DisplayName("값은 있으나 위치가 다르다면 거짓")
    @Test
    void hasValueAndNotLocation() {
        Computer computer = new Computer(List.of(1,2,3));
        boolean result = computer.hasValueAndLocation(0,2);

        Assertions.assertThat(result).isFalse();
    }
}