import java.util.Locale;
import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String spell = scanner.nextLine();
        String commandLine = scanner.nextLine();

        while (!commandLine.equals("Abracadabra")) {
            String[] command = commandLine.split(" ");
            switch (command[0]) {
                case "Abjuration":
                    spell = spell.toUpperCase(Locale.ROOT);
                    System.out.println(spell);
                    break;
                case "Necromancy":
                    spell = spell.toLowerCase(Locale.ROOT);
                    System.out.println(spell);
                    break;
                case "Illusion":
                    int index = Integer.parseInt(command[1]);
                    String letter = command[2];
                    if (index >= 0 && index < spell.length()) {
                        spell = spell.substring(0, index) + letter + spell.substring(index + 1);
                        System.out.println("Done!");
                    } else System.out.println("The spell was too weak.");
                    break;
                case "Divination":
                    String firstSubstring = command[1];
                    String secondSubstring = command[2];
                    spell = spell.replace(firstSubstring, secondSubstring);
                    System.out.println(spell);
                    break;
                case "Alteration":
                    String substring = command[1];
                    spell = spell.replace(substring, "");
                    System.out.println(spell);
                    break;
                default:
                    System.out.println("The spell did not work!");
            }

            commandLine = scanner.nextLine();
        }

    }
}

//•	The possible commands are:
//o	"Abracadabra"
//o	"Abjuration"
//o	"Necromancy"
//o	"Illusion {index} {letter}"
//o	"Divination {first substring} {second substring}"
//o	"Alteration {substring}"
//Output
//•	The possible outputs are:
//o	"The spell did not work!"
//o	"The spell was too weak."
//o	"Done!"
//•	The possible commands are:
//o	"Abracadabra"
//o	"Abjuration"
//o	"Necromancy"
//o	"Illusion {index} {letter}"
//o	"Divination {first substring} {second substring}"
//o	"Alteration {substring}"
//Output
//•	The possible outputs are:
//o	"The spell did not work!"
//o	"The spell was too weak."
//o	"Done!"