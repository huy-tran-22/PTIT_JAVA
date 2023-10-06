import java.util.Scanner;

public class J03024_So_Uu_The {
	public static int solve(String s) {
		int l = s.length();
		int ch = 0;
		int le = 0;
		for (int i = 0 ; i < l ; i++) {
			if (s.charAt(i) > '9' || s.charAt(i) < '0') return -1;
			if ((s.charAt(i) - '0') % 2 == 0) ch ++;
			else le ++;
		}
		if ((l % 2 == 0 && ch > le) || (l % 2 == 1 && le > ch)) return 1;
		return 0;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			if (solve(s) == -1) System.out.println("INVALID");
			else if (solve(s) == 0) System.out.println("NO");
			else System.out.println("YES");
		}
	}
}
