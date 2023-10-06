import java.util.Scanner;

public class J03007_So_Dep_2 {
	public static boolean check(String s) {
		String S = new StringBuilder(s).reverse().toString();
		if (s.equals(S) == false) return false;
		int t = 0;
		for (int i = 0 ; i < s.length() ; i++) {
			t += (s.charAt(i) - '0');
		}
		if (t % 10 != 0) return false;
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			System.out.println(s.charAt(0)== '8' && s.charAt(s.length()-1) == '8' && check(s) == true ? "YES" : "NO");
		}
	}
	
	
}
