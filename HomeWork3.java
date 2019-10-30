import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {
    static Random random = new Random();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.print("Make a choice:\n"+
                    "1. Guess the Number\n2. Guess the Word\n3. Exit\n: ");
            switch (sc.next()) {
                case "1":
                    guessTheNumber();
                    break;
                case "2":
                    guessTheWord();
                    break;
                default:
                    return;
            }
        }
    }

    static void guessTheNumber() {
        do {
            int count = 0;
            int guess = -1;
            int number = random.nextInt(10);
            while (count < 3 && guess != number) {
                System.out.print(
                        "Guess [" + (count + 1) + "] the number (0..9): ");
                try {
                    guess = sc.nextInt();
                    if (number == guess) {
                        System.out.println("You won!");
                    } else {
                        System.out.println("Your number is " + ((guess > number)?
                                "greater" : "less."));
                        count++;
                    }
                } catch (InputMismatchException ex) {
                    System.out.println("Input Mismatch Exception!");
                    sc.next();
                }
            }
            if (count == 3)
                System.out.println("You lost!");
            System.out.print("Repeat the game?\n[1 - yes / 0 - no]: ");
        } while (sc.next().equals("1"));
    }

    static void guessTheWord() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot","avocado", "broccoli", "carrot", "cherry", "garlic", "grape","melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
         "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String guess = null;
        String word = words[random.nextInt(words.length)];
        System.out.println(Arrays.toString(words));
        do {
            System.out.print("Guess the word: ");
            guess = sc.next();
            for (int i = 0; i < 15; i++)
                if (i < word.length() && i < guess.length() &&
                        word.charAt(i) == guess.charAt(i))
                    System.out.print(word.charAt(i));
                else
                    System.out.print((word.equals(guess))? "" : "#");
            System.out.println();
        } while (!word.equals(guess));
    }


    static String[] readFromFile(File file) {
        String str = "";
        try (Scanner read = new Scanner(file)) {
            while (read.hasNext())
                str += read.nextLine() + "\n";
        } catch (IOException ex) {}
        return str.split("\n");
    }
}

