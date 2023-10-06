import java.util.Scanner;

public class J02014_Diem_Can_Bang {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			int[] cnt = new int[n];
			long sum = 0;
			
			for (int i = 0 ; i < n ; i++) {
				a[i] = sc.nextInt();
				sum += a[i];
				if (i == 0) cnt[i] = a[i];
				else cnt[i] = cnt[i-1] + a[i];
			}
			
			int check = 0;
			for (int i = 1 ; i < n ; i++) {
				if (cnt[i-1] == sum - cnt[i]) {
					System.out.println(i+1);
					check = 1;
					break;
				}
			}
			if (check == 0) System.out.println("-1");
		}
	}
}
