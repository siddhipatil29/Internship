package Worksheet_B;

public class vowels {
    public static void main(String[] args) {
        String input1 = "Hello";
        String input2 = "nm";
        
        System.out.println("String: " + input1 + ", Contains Vowel: " + containsVowel(input1));
        System.out.println("String: " + input2 + ", Contains Vowel: " + containsVowel(input2));
    }
    
    public static boolean containsVowel(String str) {
        String vowels = "aeiouAEIOU"; 
        
        for (char ch : str.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                return true; 
            }
        }
        
        return false;
    }
}

