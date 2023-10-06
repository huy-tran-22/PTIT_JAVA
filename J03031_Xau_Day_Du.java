import java.util.HashSet;
import java.util.Scanner;

public class J03031_Xau_Day_Du {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			int k = sc.nextInt();
			HashSet<Character> se = new HashSet<Character>();
			for (int i = 0 ; i < s.length(); i++) {
				se.add(s.charAt(i));
			}
			if (k >= 26-se.size()) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}
