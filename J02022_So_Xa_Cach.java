import java.util.Scanner;

public class J02022_So_Xa_Cach {
	
	public static int[] ans;
	public static int n;
	public static int vs[];

	public static void check() {
		for (int i = 1 ; i < n ; i++) {
			if (Math.abs(ans[i] - ans[i+1]) == 1) {
				return;
			}
		}
		for (int i = 1 ; i <= n ; i++) {
			System.out.print(ans[i]);
		}
		System.out.println();
	}
	
	public static void solve(int k) {
		for (int i = 1 ; i <= n ; i++) {
			if (vs[i] != 1) {
				ans[k] = i;
				vs[i] = 1;
				
				if (k == n) {
					check();
				}
				else solve(k+1);
				vs[i] = 0;

			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			n = sc.nextInt();
			ans = new int[n+1];
			vs = new int[n+1];
			solve(1);
		}
	}
}
