import java.util.Scanner;

public class J01018_So_K_Lien_ke {
	public static Scanner sc = new Scanner(System.in);
	public static boolean check(String s) {
		int tong = 0;
		for (int i = 0 ; i < s.length() - 1; i++) {
			char x = s.charAt(i); char y = s.charAt(i+1);
			tong += (x - '0');
			int c = x-y;
			if (Math.abs(c) != 2) return false;
		}
		tong += (s.charAt(s.length()-1) - '0');
		if (tong % 10 == 0) return true;
		else return false;
	}
	public static void main(String[] args) {
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			if (check(s)) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}
