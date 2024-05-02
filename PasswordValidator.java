import java.util.Scanner;

public class PasswordValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una contrasenia: ");
        String password = scanner.nextLine();
        scanner.close();

        int digitCount = countDigits(password);
        int specialCharCount = countSpecialCharacters(password);
        int uppercaseCount = countUppercaseLetters(password);

        if (validatePassword(password)) {
            System.out.println("Contrasenia valida.");
            System.out.println("Digitos numericos utilizados: " + digitCount);
            System.out.println("Caracteres especiales utilizados: " + specialCharCount);
            System.out.println("Mayusculas utilizadas: " + uppercaseCount);
        } else {
            System.out.println("La contrasenia no cumple con los requisitos.");
        }
    }

    public static boolean validatePassword(String password) {
        int MIN_LENGTH = 8;
        return password.length() >= MIN_LENGTH;
    }

    public static int countDigits(String password) {
        int digitCount = 0;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }
        return digitCount;
    }

    public static int countSpecialCharacters(String password) {
        String SPECIAL_CHARACTERS = "!@#$%^&*";
        int specialCharCount = 0;
        for (char c : password.toCharArray()) {
            if (SPECIAL_CHARACTERS.contains(String.valueOf(c))) {
                specialCharCount++;
            }
        }
        return specialCharCount;
    }

    public static int countUppercaseLetters(String password) {
        int uppercaseCount = 0;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                uppercaseCount++;
            }
        }
        return uppercaseCount;
    }
}
