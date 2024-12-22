public class CommandLineArguments {
    public static void main(String[] args) {
        // Check if any arguments were passed
        if (args.length == 0) {
            System.out.println("No arguments were provided.");
        } else {
            System.out.println("You provided the following arguments:");
            // Loop through the arguments and print them
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + (i + 1) + ": " + args[i]);
            }
        }
    }
}