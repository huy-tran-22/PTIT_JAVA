import java.util.Scanner;

public class J03040_Bien_Dep {
	public static int solve(String s) {
		int l = s.length();
		int ok = 1;
		for (int i = 0 ; i < l-1; i++) {
			if (s.charAt(i) >= s.charAt(i+1)) ok = 0;
		}
		if (ok == 1) return 1;
		
		ok = 1;
		for (int i = 0 ; i < l-1 ; i++) {
			if (s.charAt(i) != s.charAt(i+1)) ok = 0;
		}
		if (ok == 1) return 1;
		
		if (s.charAt(0) == s.charAt(1) && s.charAt(1)== s.charAt(2) && s.charAt(3) == s.charAt(4)) return 1;
		
		ok = 1;
		for (int i = 0 ; i < l ; i++) {
			if (s.charAt(i) != '6' && s.charAt(i) != '8') ok = 0;
		}
		if (ok == 1) return 1;
		return 0;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			String res = s.substring(5,8) + s.substring(9,11);
			if (solve (res) == 1) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}
