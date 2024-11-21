package Task;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Converter {
    public static BigInteger convertToInteger(double floatNumber) {
        BigDecimal decimalValue = new BigDecimal(floatNumber);
        return decimalValue.toBigIntegerExact();
    }
}
