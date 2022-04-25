package racingcar;

public class RacingCar {

    private RacingCarStatus racingCarStatus;

    private final RacingCarName racingCarName;

    public RacingCar(String racingCarName) {
        this.racingCarName = new RacingCarName(racingCarName);
    }

    public RacingCarName getRacingCarName() {
        return racingCarName;
    }

    public RacingCarStatus getRacingCarStatus() {
        return this.racingCarStatus;
    }

    public RacingCarStatus command(String command) {
        this.racingCarStatus = RacingCarStatus.of(new RacingCarCommand(command));
        return this.racingCarStatus;
    }
}
