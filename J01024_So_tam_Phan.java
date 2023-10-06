
import java.util.Scanner;

public class J01024_So_tam_Phan {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int ok = 1;
            for (int i = 0; i < s.length(); i++) {
                char x = s.charAt(i);
                if (x != '0' && x != '1' && x != '2') {
                    ok = 0;
                    break;
                }
            }
            if (ok == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
