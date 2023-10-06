import java.util.Scanner;

public class J02035_Quay_Phai {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			long[] a = new long[n];
			for (int i = 0 ; i < n ; i++) {
				a[i] = sc.nextLong();
			}
			int ok = 0;
			for (int i = 0 ; i < n-1 ; i++) {
				if (a[i] > a[i+1]) {
					System.out.println(i+1);
					ok = 1;
					break;
				}
			}
			if (ok == 0) System.out.println(0);
		}
	}
}
