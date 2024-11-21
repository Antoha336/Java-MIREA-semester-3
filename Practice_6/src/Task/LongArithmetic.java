package Task;

class CarryOverException extends Exception {}

public class LongArithmetic {
    public LongNumber add(LongNumber a, LongNumber b) {
        if (a.isNegative() == b.isNegative()) {
            return addSameSign(a, b);
        } else {
            if (compareAbsolute(a, b) >= 0) {
                LongNumber result = subtractAbs(a, b);
                result.setNegative(a.isNegative());
                return result;
            } else {
                LongNumber result = subtractAbs(b, a);
                result.setNegative(b.isNegative());
                return result;
            }
        }
    }

    public LongNumber subtract(LongNumber a, LongNumber b) {
        if (a.isNegative() != b.isNegative()) {
            LongNumber result = addSameSign(a, b);
            result.setNegative(a.isNegative());
            return result;
        } else {
            if (compareAbsolute(a, b) >= 0) {
                LongNumber result = subtractAbs(a, b);
                result.setNegative(a.isNegative());
                return result;
            } else {
                LongNumber result = subtractAbs(b, a);
                result.setNegative(!a.isNegative());
                return result;
            }
        }
    }

    public LongNumber multiply(LongNumber a, LongNumber b) {
        int[] result = new int[a.getDigits().length + b.getDigits().length];

        for (int i = 0; i < a.getDigits().length; i++) {
            int carry = 0;
            for (int j = 0; j < b.getDigits().length; j++) {
                int product = a.getDigits()[i] * b.getDigits()[j] + result[i + j] + carry;
                result[i + j] = product % 10;
                carry = product / 10;
            }
            result[i + b.getDigits().length] = carry;
        }

        LongNumber longNumber = new LongNumber(Integer.valueOf(arrayToString(result)));
        longNumber.setNegative(a.isNegative() != b.isNegative());
        return longNumber;
    }

    private LongNumber addSameSign(LongNumber a, LongNumber b) {
        int[] result = new int[Math.max(a.getDigits().length, b.getDigits().length) + 1];
        boolean isNegative = a.isNegative();

        try {
            int carry = 0;
            for (int i = 0; i < result.length - 1; i++) {
                int sum = carry;
                if (i < a.getDigits().length) sum += a.getDigits()[i];
                if (i < b.getDigits().length) sum += b.getDigits()[i];
                if (sum >= 10) {
                    throw new CarryOverException();
                }
                result[i] = sum % 10;
                carry = sum / 10;
            }
        } catch (CarryOverException e) {
            System.out.println(e.getMessage());
            result[result.length - 1] = 1;
        }

        LongNumber longNumber = new LongNumber(Integer.valueOf(arrayToString(result)));
        longNumber.setNegative(isNegative);
        return longNumber;
    }

    private LongNumber subtractAbs(LongNumber a, LongNumber b) {
        int[] result = new int[Math.max(a.getDigits().length, b.getDigits().length)];
        int borrow = 0;
        for (int i = 0; i < result.length; i++) {
            int diff = (i < a.getDigits().length ? a.getDigits()[i] : 0)
                    - (i < b.getDigits().length ? b.getDigits()[i] : 0)
                    - borrow;
            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            result[i] = diff;
        }

        return new LongNumber(Integer.valueOf(arrayToString(result)));
    }

    private int compareAbsolute(LongNumber a, LongNumber b) {
        if (a.getDigits().length != b.getDigits().length) {
            return Integer.compare(a.getDigits().length, b.getDigits().length);
        }
        for (int i = a.getDigits().length - 1; i >= 0; i--) {
            if (a.getDigits()[i] != b.getDigits()[i]) {
                return Integer.compare(a.getDigits()[i], b.getDigits()[i]);
            }
        }
        return 0;
    }

    private String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        boolean leadingZero = true;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == 0 && leadingZero) continue;
            leadingZero = false;
            sb.append(array[i]);
        }
        return leadingZero ? "0" : sb.toString();
    }
}