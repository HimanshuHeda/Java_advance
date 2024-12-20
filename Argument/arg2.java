public class arg2 {
    public static void main(String[] args) {
        int n, sum=0;
        n = args.length;
        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(args[i]);
        }
        System.out.println("Result = " + sum);
    }
}
