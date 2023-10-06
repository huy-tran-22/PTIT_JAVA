import java.util.Scanner;

public class J03008_So_Dep_3 {
	public static int snt (char i) {
		if (i != '2' && i != '3' && i != '5' && i != '7') return 0;
		return 1;
	}
	
	public static int check(String s) {
		String S = new StringBuilder(s).reverse().toString();
		if (s.equals(S) == false) return 0;
		for (int i = 0 ; i < s.length() ; i++) {
			if (snt(s.charAt(i)) == 0) return 0;
		}
		return 1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			System.out.println(check(s) == 0 ? "NO" : "YES");
		}
	}
}
