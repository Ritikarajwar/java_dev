package internship;

import java.util.Scanner;

class palindrome {
    public boolean isPalindrome(String s) {
       
        if (s.isEmpty()) {
            return true;
        }
        
        int first = 0;
        int last = s.length() - 1;

        while (first <= last) {
            char currFirst = s.charAt(first);
            char currLast = s.charAt(last);
             
            if (!Character.isLetterOrDigit(currFirst)) {
                first++;
            } 
            
            else if (!Character.isLetterOrDigit(currLast)) {
                last--;
            } 
            
            else {
                if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
                    return false;
                }
                first++;
                last--;
            }
        }
        
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        palindrome sol = new palindrome();
        
        System.out.println("Enter a word or phrase to check if it's a palindrome: ");
        String value = sc.nextLine();
        
        if (sol.isPalindrome(value)) {
            System.out.println("The input is a palindrome.");
        } else {
            System.out.println("The input is not a palindrome.");
        }
    }
}

