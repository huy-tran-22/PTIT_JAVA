import java.util.Scanner;

public class J02007_So_Lan_Xuat_hien {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		int  c = 1;
		while (c <= t) {
			System.out.println("Test " + c + ":");
			c ++;
			int n = sc.nextInt();
			int a[] = new int[101];
			for (int i = 0 ; i < n ; i++) {
				a[i] = sc.nextInt();
			}
			int cnt[] = new int[1000001];
			int ok[] = new int[1000001];
			for (int i = 0 ; i < 1000001; i ++) {
				ok[i] = 0;
				cnt[i] = 0;
			}
			for (int i = 0 ; i < n ; i++) {
				cnt[a[i]]++;
			}
			for (int i = 0 ; i < n ; i++) {
				if (ok[a[i]] == 0 && cnt[a[i]] > 0) {
					System.out.println(a[i] + " xuat hien " + cnt[a[i]] + " lan");
					ok[a[i]] = 1;
				}
			}
		}
	}
}
