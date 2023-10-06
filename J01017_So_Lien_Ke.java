import java.util.Scanner;

public class J01017_So_Lien_Ke {
	public static Scanner sc = new Scanner (System.in);
	public static boolean check(String s) {
		for (int i = 0 ; i < s.length()-1 ; i++) {
			char x = s.charAt(i); char y = s.charAt(i+1);
			int c = x-y;
			if (Math.abs(c) > 1 || c == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			if(check(s) == true) {
				System.out.println("YES");
			}
			else System.out.println("NO");
		}
	}
}


