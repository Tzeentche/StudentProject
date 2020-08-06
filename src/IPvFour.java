import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPvFour {

    public static void main(String[] args) {

        int counter = 0;
        String IPv4 = "0.0.0.0";

        Pattern pattern = Pattern.compile("^(\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5]){3}(\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])$");
        Matcher matcher = pattern.matcher(IPv4);
    }
}
