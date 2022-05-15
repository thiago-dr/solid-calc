import java.security.InvalidParameterException;

public class Division implements Operation {

    @Override
    public double calc(double num1, double num2) {
        if (num2 != 0)
            return num1 / num2;
        else
            throw new InvalidParameterException("Cannot divide by zero");
    }
}
