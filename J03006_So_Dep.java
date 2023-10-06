import java.util.Scanner;

public class J03006_So_Dep {
	public static int check (String s) {
		String S = new StringBuilder(s).reverse().toString();
		if (!s.equals(S)) return 0;
		for (int i = 0 ; i < s.length() ; i++) {
			int tmp = Integer.parseInt(String.valueOf(s.charAt(i)));
			if (tmp % 2 != 0) return 0;
		}
		return 1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = Integer.parseInt(sc.nextLine());
		while (t-- > 0) {
			String s = sc.next();
			if (check(s) == 1) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}
}
