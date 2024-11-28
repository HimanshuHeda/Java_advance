// Implement 2 problem, first one should use String class and its methods.

public class strings {
    public static void main(String[] args) {
        // Initialize the String
        String str = new String("Himanshu Heda");
        
        // Print the original string
        System.out.println("The String is: " + str);
        
        // Convert to uppercase
        System.out.println("The String in UpperCase is: " + str.toUpperCase());
        
        // Convert to lowercase
        System.out.println("The String in LowerCase is: " + str.toLowerCase());
        
        // Print the string using toString (not necessary, but shown for demonstration)
        System.out.println("The ToString is: " + str.toString());
        
        // Get a subsequence of the string
        System.out.println("The subSequence of the String is: " + str.subSequence(7, 12));
        
        // Check if the string starts with a specific prefix
        System.out.println("Checks The string Starts With: " + str.startsWith("Hima"));
        
        // Split the string based on specified regex (comma, period, or whitespace)
        String regex = "[,\\.\\s]+"; // Added + to handle multiple consecutive delimiters
        String[] myArray = str.split(regex);
        
        // Print each split string
        for (String s : myArray) {
            System.out.println("The String Split is: " + s);
        }
        
        // Replacing the first occurrence of a word with "at"
        System.out.println("The string Will Replace First Word: " + str.replaceFirst(myArray[0], "at"));

        // Replacing all occurrences of delimiters with "Hello"
        System.out.println("The string after replacing all delimiters: " + str.replaceAll(regex, "Hello"));
    }
}