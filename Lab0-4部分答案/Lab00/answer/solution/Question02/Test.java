import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("19373300 HZY");
        while (scanner.hasNextLine()) {
            String cmd = scanner.nextLine();
            if (cmd.equals("QUIT")) {
                System.out.println("----- Good Bye! -----");
            } else {
                System.out.println("Hello, World!");
            }
        }
    }
}
