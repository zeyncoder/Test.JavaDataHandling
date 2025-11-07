package level3.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindNumber {
    public static void main(String[] args) {
        String text="My marks are 85, 90 and 78.";
        Pattern pattern=Pattern.compile("\\d+");
        Matcher matcher=pattern.matcher(text);
        while(matcher.find()){
            System.out.println(matcher.group());
        }

    }
}
