import java.util.Scanner;

public class TweetProcessor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un tweet
        System.out.print("Ingresa un tweet (maximo 280 caracteres): ");
        String tweet = scanner.nextLine();

        // Verificar la longitud del tweet
        int longitud = tweet.length();
        if (longitud > 280) {
            System.out.println("El tweet excede los 280 caracteres. Por favor, acortalo.");
            return; // Salir del programa si el tweet es demasiado largo
        }

        // Concatenar un hashtag al final del tweet
        System.out.print("Ingresa un hashtag: ");
        String hashtag = scanner.nextLine();
        StringBuilder tweetConHashtag = new StringBuilder(tweet);
        tweetConHashtag.append(" #").append(hashtag);

        // Solicitar al usuario que ingrese su nombre de usuario
        System.out.print("Ingresa tu nombre de usuario de Twitter (sin '@'): ");
        String nombreUsuario = scanner.nextLine();

        // Mostrar el tweet completo con el nombre de usuario
        tweetConHashtag.append(" @" + nombreUsuario);
        System.out.println("Tweet completo: " + tweetConHashtag);

        // Calcular la cantidad de caracteres
        int caracteresTotales = tweetConHashtag.length();
        System.out.println("Cantidad total de caracteres: " + caracteresTotales);

        // Cerrar el scanner
        scanner.close();
    }
}