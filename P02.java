import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Pattern patternMessage = Pattern.compile("([%$])(?<message>[A-Z][a-z]{2,})\\1: \\[(?<d1>\\d+)\\]\\|\\[(?<d2>\\d+)\\]\\|\\[(?<d3>\\d+)\\]\\|");
        for (int i = 0; i < n; i++) {
            String message = scanner.nextLine();
            Matcher matcherMessage = patternMessage.matcher(message);
            if (matcherMessage.matches()) {
                String decryptedMessage = "";
                decryptedMessage = decryptedMessage + (char) Integer.parseInt(matcherMessage.group("d1"));
                decryptedMessage = decryptedMessage + (char) Integer.parseInt(matcherMessage.group("d2"));
                decryptedMessage = decryptedMessage + (char) Integer.parseInt(matcherMessage.group("d3"));
                System.out.println(matcherMessage.group("message") + ": " + decryptedMessage);

            } else
                System.out.println("Valid message not found!");
        }
    }
}
