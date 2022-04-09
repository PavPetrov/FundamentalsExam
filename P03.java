import java.sql.SQLOutput;
import java.util.*;
import java.util.regex.Matcher;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> dictionary= new LinkedHashMap<>();
        String[] input = scanner.nextLine().split(" \\| ");

        for (int i = 0; i < input.length; i++) {
            String[] wordDefinitions = input[i].split(": ");
            String word = wordDefinitions[0];
            String definitions = wordDefinitions[1];
            if ( dictionary.containsKey(word)){
                dictionary.get(word).add(definitions);
            } else {
                dictionary.put(word, new ArrayList<>(Arrays.asList(definitions)));
            }
        }
        String[] teacherTestWords = scanner.nextLine().split(".\\|.");
        String testCommand = scanner.nextLine();

        if (testCommand.equals("Test")){
            for (int i = 0; i < teacherTestWords.length; i++) {
                if (dictionary.containsKey(teacherTestWords[i])){
                    String word = teacherTestWords[i];
                    System.out.println(word + ":");
                    dictionary.get(word).forEach(e -> System.out.println(" -" + e));
                }
            }
            /*for (Map.Entry<String, List<String>> word : dictionary.entrySet()) {
                System.out.println(word.getKey() + ": ");
                word.getValue().forEach(e -> System.out.println("-" + e));
            }*/

        }
        if (testCommand.equals("Hand Over")){
            dictionary.entrySet().forEach(e -> System.out.print(e.getKey() + " "));
        }
        System.out.println();
    }
}
