public class Test {
    public static double getPi(int n) {
        double res = 0, base  = 1;
        for (int i = 0; i <= n; ++i, base = -base)
            res += base / (2 * i + 1);
        return res * 4;
    }

    public static void main(String[] args) {
        System.out.println(getPi(1000));
    }
}
