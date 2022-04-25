package racingcar;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RacingCarTest {

    private static final String ERROR_MESSAGE_PREFIX = "[ERROR]";

    @Test
    @DisplayName("전진 또는 정지")
    void isMoveOrStop() {
        assertThat(RacingCarStatus.isMoveStatus(new RacingCar("woon").command("0"))).isEqualTo(false);
        assertThat(RacingCarStatus.isMoveStatus(new RacingCar("woon").command("4"))).isEqualTo(true);
        assertThat(RacingCarStatus.isStopStatus(new RacingCar("woon").command("3"))).isEqualTo(true);
        assertThat(RacingCarStatus.isStopStatus(new RacingCar("woon").command("9"))).isEqualTo(false);
    }

    @Test
    @DisplayName("이름 설정 예외처리 확인")
    void validateRacingCarName() {
        assertThatThrownBy(() -> new RacingCar("yongwoon")).isInstanceOf(IllegalArgumentException.class).hasMessageContaining(ERROR_MESSAGE_PREFIX);
    }

    @Test
    @DisplayName("레이싱카 명령 예외처리 확인")
    void validateRacingCarCommand() {
        assertThatThrownBy(() -> new RacingCar("woon").command("10")).isInstanceOf(IllegalArgumentException.class).hasMessageContaining(ERROR_MESSAGE_PREFIX);
        assertThatThrownBy(() -> new RacingCar("woon").command("-1")).isInstanceOf(IllegalArgumentException.class).hasMessageContaining(ERROR_MESSAGE_PREFIX);
        assertThatThrownBy(() -> new RacingCar("woon").command("A")).isInstanceOf(IllegalArgumentException.class).hasMessageContaining(ERROR_MESSAGE_PREFIX);
        assertThatThrownBy(() -> new RacingCar("woon").command(" ")).isInstanceOf(IllegalArgumentException.class).hasMessageContaining(ERROR_MESSAGE_PREFIX);
    }

}
