package Practice_6;

public class LongNumber {
    private int[] digits;
    private boolean isNegative;

    public LongNumber(Integer _number) {
        String number = _number.toString();
        if (number.charAt(0) == '-') {
            isNegative = true;
            number = number.substring(1);
        } else {
            isNegative = false;
        }
        digits = new int[number.length()];
        for (int i = 0; i < number.length(); i++) {
            digits[i] = Character.getNumericValue(number.charAt(number.length() - 1 - i));
        }
    }

    // Преобразование в строку для вывода
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (isNegative) sb.append("-");
        for (int i = digits.length - 1; i >= 0; i--) {
            sb.append(digits[i]);
        }
        return sb.toString();
    }

    public int[] getDigits() {
        return digits;
    }

    public boolean isNegative() {
        return isNegative;
    }

    public void setNegative(boolean negative) {
        this.isNegative = negative;
    }
}