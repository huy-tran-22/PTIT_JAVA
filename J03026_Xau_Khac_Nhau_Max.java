import java.util.Scanner;

public class J03026_Xau_Khac_Nhau_Max {
	
	public static int solve (String a, String b) {
		if (a.equals(b) == true) return -1;
		else {
			return Math.max(a.length(),b.length());
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String a = sc.next();
			String b = sc.next();
			System.out.println(solve(a,b));
		}
	}
}
