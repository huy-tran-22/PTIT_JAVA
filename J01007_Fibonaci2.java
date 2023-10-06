import java.util.Scanner;

public class J01007_Fibonaci2 {
	public static Scanner sc = new Scanner(System.in);
	public static void Fibo(long F[]) {
		F[0] = 0;
		F[1] = 1;
		F[2] = 1;
		for (int i = 3 ; i <= 95 ; i++) {
			F[i] = F[i-2] + F[i-1];
		}
	}
	public static void main(String[] args) {
		long F[];
		F = new long[96];
		Fibo(F);
		int t = sc.nextInt();
		while (t-- > 0) {
			long n = sc.nextLong();
			int ok = 0;
			for (int i = 0 ; i <= 95 ; i++) {
				if (F[i] == n) {
					System.out.println("YES");
					ok = 1;
					break;
				}
			}
			if (ok == 0) {
				System.out.println("NO");
			}
		}
	}
}
