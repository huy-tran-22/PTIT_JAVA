import java.util.Scanner;

public class J02021_To_Hop_2 {
	public static int[]a = new int[10];
	public static int ok;
	
	public static void sinh (int n, int k) {
		int i = k;
		while (i >= 1 && a[i] == n-k+i) i--;
		if (i == 0) {
			ok = 0;
		}
		else {
			a[i] ++;
			for (int j = i+1 ; j <= k ; j++) {
				a[j] = a[j-1] + 1;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		for (int i = 1 ; i < k+1 ; i++) a[i] = i;
		ok = 1; 
		int cnt = 0;
		while (ok == 1) {
			for (int i = 1 ; i <= k ; i++) System.out.print(a[i]);
			System.out.print(" ");
			cnt ++;
			sinh(n,k);
		}
		System.out.println();
		System.out.printf("Tong cong co %d to hop",cnt);
	}
}
