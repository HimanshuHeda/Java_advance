public class Basics {

    // A function to greet the user
    public static String greetUser(String name) {
        return "Hello, " + name + "!";
    }

    public static void main(String[] args) {
        // 1. Variables
        String name = "Himanshu";
        int age = 25;

        // 2. Printing a greeting
        System.out.println(greetUser(name));

        // 3. Conditional
        if (age < 18) {
            System.out.println("You are a minor.");
        } else if (age < 60) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a senior citizen.");
        }

        // 4. Loop
        System.out.println("Counting to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}
