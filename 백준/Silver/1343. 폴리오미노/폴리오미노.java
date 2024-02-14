import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String board = scanner.nextLine().trim();

        int n = board.length();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char ch = board.charAt(i);
            if (ch == '.') {
                result.append('.');
            } else if (ch == 'X') {
                if (i + 3 < n && board.substring(i, i + 4).equals("XXXX")) {
                    result.append("AAAA");
                    i += 3;
                } else if (i + 1 < n && board.substring(i, i + 2).equals("XX")) {
                    result.append("BB");
                    i += 1;
                } else {
                    System.out.println("-1");
                    return;
                }
            }
        }

        System.out.println(result.toString());
    }
}
