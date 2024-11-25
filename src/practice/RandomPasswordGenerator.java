package internship;
import java.util.Scanner;
import java.util.Random;

public class RandomPasswordGenerator {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        Random random = new Random();
	        
	        System.out.print("Enter the desired password length: ");
	        int length = input.nextInt();
	        
	        System.out.print("Include numbers (true/false)? ");
	        boolean includeNumbers = input.nextBoolean();
	        
	        System.out.print("Include lowercase letters (true/false)? ");
	        boolean includeLower = input.nextBoolean();
	        
	        System.out.print("Include uppercase letters (true/false)? ");
	        boolean includeUpper = input.nextBoolean();
	        
	        System.out.print("Include special characters (true/false)? ");
	        boolean includeSpecial = input.nextBoolean();

	        String numbers = "0123456789";
	        String lower = "abcdefghijklmnopqrstuvwxyz";
	        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	        String special = "!@#$%^&*()-_=+[]{};:,.<>?";

	        StringBuilder allChars = new StringBuilder();
	        if (includeNumbers) allChars.append(numbers);
	        if (includeLower) allChars.append(lower);
	        if (includeUpper) allChars.append(upper);
	        if (includeSpecial) allChars.append(special);

	        StringBuilder password = new StringBuilder();
	        for (int i = 0; i < length; i++) {
	            int index = random.nextInt(allChars.length());
	            password.append(allChars.charAt(index));
	        }

	        System.out.println("Generated password: " + password);
	    }

}
