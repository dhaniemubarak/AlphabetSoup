import java.util.Arrays;
import java.util.Scanner;

public class AlphabetSoup {
    public static void main(String[] args) {
        System.out.print("Input :");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        AlphabetSoup test = new AlphabetSoup();
        System.out.println("Output :" + test.make(word));
    }

    public String make(String word) {
        char[] wordArray = word.toCharArray();
        Arrays.sort(wordArray);
        StringBuilder newWord = new StringBuilder();
        for (char wa : wordArray) {
            newWord.append(wa);
        }
        return newWord.toString();
    }
}
