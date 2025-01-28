import java.util.Random;

public class Password{

    public static void main(String[] args) {
        int passwordLength = 12;
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";
        String password = generatePassword(passwordLength, characters);
        System.out.println("Generated Password: " + password);
    }

    public static String generatePassword(int length, String characters) {
        Random random = new Random();
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            password.append(characters.charAt(index));
        }

        return password.toString();
    }
}           