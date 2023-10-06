import java.util.Scanner;

public class J01008_Thua_SNT {
	public static Scanner sc = new Scanner(System.in);
	public static void solve(int n) {	
		int a[] = new int [10];
		for (int i = 2 ; i <= 9 ; i++) a[i] = 0;
		for (int i = 2 ; i <= Math.sqrt(n) ; i++) {
			while (n % i == 0) {
				n /= i;
				a[i]++;
			}
		}
		for (int k = 2 ; k <= 9; k++ ) {
			if (a[k] > 0) {
				System.out.printf("%d(%d) ",k,a[k]);
			}
		}
		if (n > 1) {
			System.out.printf("%d(1)",n);
		}
	}
	public static void main(String[] args) {
		int t = sc.nextInt();
		int tc = 1;
		while (t-- > 0) {
			int n = sc.nextInt();
			System.out.printf("Test %d: ",tc);
			solve(n);
			System.out.println();
			tc++;
		}
	}
}
