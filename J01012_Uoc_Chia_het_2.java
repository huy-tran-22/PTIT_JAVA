import java.util.Scanner;

public class J01012_Uoc_Chia_het_2 {
	public static Scanner sc = new Scanner(System.in);
	public static int solve(long n) {
		if (n % 2 != 0) {
			return 0;
		}
		else {
			int cnt = 0;
			for (int i = 1; i <= Math.sqrt(n); i++) {
	            if (n % i == 0) {
	                if (i % 2 == 0) {
	                    cnt++;
	                }
	                if ((n / i) % 2 == 0 && i != Math.sqrt(n)) {
	                    cnt++;
	                }
	            }
	        }
			return cnt;
		}
		
	}
	public static void main(String[] args) {
		int t = sc.nextInt();
		while (t-- > 0) {
			long n = sc.nextInt();
			System.out.println(solve(n));
		}
	}
}
