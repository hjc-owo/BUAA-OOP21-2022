public class Test {
    public static void main(String[] args) {
        int n = (Integer.parseInt(args[0]) + 1) / 2;
        for (int i = 0;i < n; ++i) {
            for (int j = i + 1;j < n; ++j) System.out.print(' ');
            for (int j = 0;j < 2 * i + 1; ++j) System.out.print('*');
            System.out.print('\n');
        }
        for (int i = n - 2;i >= 0; --i) {
            for (int j = i + 1;j < n; ++j) System.out.print(' ');
            for (int j = 0;j < 2 * i + 1; ++j) System.out.print('*');
            System.out.print('\n');
        }
    }
}
