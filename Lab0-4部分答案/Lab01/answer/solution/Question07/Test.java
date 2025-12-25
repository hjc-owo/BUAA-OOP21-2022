public class Test {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 1; i <= n * n; ++i)
            System.out.printf("%d%c", i, i % n == 0 ? '\n' : ' ');
    }
}
