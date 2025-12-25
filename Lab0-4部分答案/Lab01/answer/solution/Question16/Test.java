public class Test {
    public static String strscat(String... args) {
        StringBuilder res = new StringBuilder();
        for (String str : args)
            res.append(str);
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(strscat("a", "b", "c", "", "e"));
    }
}
