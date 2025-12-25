import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String s = reader.nextLine();
        int i = 0, j;
        if (s.length() >= 1) {
            while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') i += 1;
            if (i == s.length()) {
                if (s.charAt(0) == '0' && s.length() > 1) System.out.println("这个字符串有前导零");
                else if (s.charAt(0) != '0') {
                    for (i = 0, j = s.length() - 1; i < j; i++, j--) if (s.charAt(i) != s.charAt(j)) break;
                    if (s.charAt(i) == s.charAt(j)) System.out.println("这是一个回文数");
                    else System.out.println("这不是一个回文数");
                } else System.out.println("这是一个回文数");
            } else System.out.println("这个字符串有其他字符");
        } else System.out.println("字符串长度小于1");
    }
}
