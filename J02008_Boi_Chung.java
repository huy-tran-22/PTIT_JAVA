import java.util.Scanner;

public class J02008_Boi_Chung {
	public static long GCD(long a, long b) {
		while (b != 0) {
			long tmp = a%b;
			a = b;
			b = tmp;
		}
		return a;
	}
	
	public static long LCM(long a, long b) {
		return a*b/GCD(a,b);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			long ans = 1;
			for (int i = 2 ; i <= n ; i++) {
				ans = LCM(ans,i);
			}
			System.out.println(ans);
		}
	}
}
