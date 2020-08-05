
import java.util.regex.*;

public class RegExes {

    public static void main(String[] args) {

        String cardNumber = "2234567890123456";
        String date = "03/12";
        String CVV = "123";

        Pattern cardNumberPattern = Pattern.compile("([2-6]([0-9](3)) ?)(([0-9](4) ?)(3))");
        Pattern datePattern = Pattern.compile("(0[1-9]|1[0-2])/([0-9](2))");
        Pattern CVVPattern = Pattern.compile("[0-9](3)");

        Matcher cardNumberMatcher = cardNumberPattern.matcher(cardNumber);
        Matcher dateMatcher = datePattern.matcher(date);
        Matcher CVVMatcher = CVVPattern.matcher(CVV);

        if(cardNumberMatcher.matches() && dateMatcher.matches() && CVVMatcher.matches()) {
            System.out.println("Card data is correct!");
        } else {
            System.out.println("Card data is incorrect!");
        }
    }
}
