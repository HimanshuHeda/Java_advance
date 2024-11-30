// second use StringBuffer class and its methods

public class buffer {
    public static void main(String[] args) {
        // Demonstrating StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append(" World!"); // Append to StringBuffer
        System.out.println("StringBuffer after append: " + stringBuffer);

        stringBuffer.reverse(); // Reverse the StringBuffer content
        System.out.println("StringBuffer after reverse: " + stringBuffer);

        stringBuffer.insert(6, "Beautiful "); // Insert into StringBuffer
        System.out.println("StringBuffer after insert: " + stringBuffer);

        stringBuffer.delete(6, 16); // Delete a portion of the StringBuffer
        System.out.println("StringBuffer after delete: " + stringBuffer);
    }
}
