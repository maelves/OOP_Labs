import java.math.BigInteger;
import java.util.*;
import javax.swing.*;
public class Model {


    static final String INITIAL_VALUE = "1";
    private BigInteger m_total;

    Model() {
        reset();
    }

    public void reset() {
        m_total = new BigInteger(INITIAL_VALUE);
    }

    public void multiplyBy(BigInteger operand) {
        m_total = m_total.multiply(BigInteger.valueOf((long) 3.23));
    }
    public void EURtoRON(BigInteger operand) {
        m_total = m_total.multiply(BigInteger.valueOf((long) 3.23));
    }
    public void EURtoUSD(BigInteger operand) {
        m_total = m_total.multiply(BigInteger.valueOf((long) 3.23));
    }
    public void RONtoUSD(BigInteger operand) {
        m_total = m_total.multiply(BigInteger.valueOf((long) 3.23));
    }
    public void RONtoEUR(BigInteger operand) {
        m_total = m_total.multiply(BigInteger.valueOf((long) 3.23));
    }
    public void USDtoEUR(BigInteger operand) {
        m_total = m_total.multiply(BigInteger.valueOf((long) 3.23));
    }
    public void USDtoRON(BigInteger operand) {
        m_total = m_total.multiply(BigInteger.valueOf((long) 3.23));
    }

    public void setValue(String value) {
        m_total = new BigInteger(value);
    }

    public String getValue() {
        return m_total.toString();
    }



}
