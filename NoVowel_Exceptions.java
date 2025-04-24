import java.util.Scanner;

class NoVowelsException extends Exception {
    public NoVowelsException(String message) {
        super(message);
    }
}

public class Main {
    public static void checkVowels(String str) throws NoVowelsException {
        if (!str.matches(".*[aeiouAEIOU].*")) {
            throw new NoVowelsException("The string does not contain any vowels.");
        } else {
            System.out.println("The string contains vowels.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        try {
            checkVowels(input);
        } catch (NoVowelsException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
