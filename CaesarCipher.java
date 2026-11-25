//Sunday Shiba
//EDU/LIS/24/098
//Library and Information Science
//TASK 9.7

/*
 * This program implements the Caesar cipher for encrypting and decrypting messages.
 */

public class CaesarCipher {

    // Encrypt a message
    public static String encrypt(String message, int shift) {
        String result = "";

        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);

            // Encrypt uppercase letters
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) ('A' + (ch - 'A' + shift) % 26);
            }

            // Encrypt lowercase letters
            else if (ch >= 'a' && ch <= 'z') {
                ch = (char) ('a' + (ch - 'a' + shift) % 26);
            }

            // Keep spaces, digits and punctuation unchanged
            result += ch;
        }

        return result;
    }

    // Decrypt a message
    public static String decrypt(String message, int shift) {
        return encrypt(message, (26 - shift) % 26);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a message: ");
        String message = input.nextLine();

        System.out.print("Enter shift value: ");
        int shift = input.nextInt();

        // Normalize shift to the range 0 to 25
        shift = ((shift % 26) + 26) % 26;

        // Encrypt the message
        String encrypted = encrypt(message, shift);

        System.out.println("Encrypted message: " + encrypted);

        // Decrypt the encrypted message
        String decrypted = decrypt(encrypted, shift);

        System.out.println("Decrypted message: " + decrypted);

        input.close();
    }
}
