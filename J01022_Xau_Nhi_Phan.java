import java.util.Scanner;

public class J01022_Xau_Nhi_Phan {
	public static Scanner sc = new Scanner(System.in);
	public static void Fibo(long f[]) {
		f[0] = 0;
		f[1] = 1;
		f[2] = 1;
		for (int i = 3 ; i <= 93 ; i++) {
			f[i] = f[i-2] + f[i-1];
		}
	}
	public static int solve(long f[], int n, long k) {
		if (n == 1) return 0;
		if (n == 2) return 1;
		if (k <= f[n-2]) {
			return solve(f,n-2,k);
		}
		else {
			return solve(f,n-1,k - f[n-2]);
		}
	}
	public static void main(String[] args) {
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			long k = sc.nextLong();
			long f[] = new long[94];
			Fibo(f);
			System.out.println(solve(f,n,k));
		}
	}
}
