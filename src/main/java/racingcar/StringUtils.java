package racingcar;

public class StringUtils {

    public static int toIntDigit(String digit) {
        if (!validationDigit(digit))
            throw new IllegalArgumentException(ErrorMessageUtils.createMessage("입력한 값이 숫자가 아닙니다."));
        return Character.getNumericValue(digit.charAt(0));
    }

    private static boolean validationDigit(String digit) {
        return digit.length() == 1 && Character.isDigit(digit.charAt(0));
    }

}
