package level5.CombineWrapper;

import java.util.regex.*;
import java.util.Scanner;

public class CombineWrapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qiyməti daxil et (məs: 49.99 AZN): ");
        String input = sc.nextLine();

        String regex = "\\d+(\\.\\d+)?";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
            String numberPart = matcher.group();
            double price = Double.parseDouble(numberPart);
            System.out.println("Qiymət : " + price);
        } else {
            System.out.println("Rəqəm tapılmadı!");
        }
    }
}
