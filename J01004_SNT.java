import java.util.Scanner;

public class J01004_SNT {
	public static Scanner sc = new Scanner(System.in);
	public static boolean solve(int n) {
		if (n < 2) {
			return false;
		}
		if (n == 2) {
			return true;
		}
		for (int i = 2 ; i <= Math.sqrt(n) ; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			if(solve(n) == true) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}
}
