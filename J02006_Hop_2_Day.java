import java.util.*;

public class J02006_Hop_2_Day {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int m = sc.nextInt(); 
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[m];
		int[] res = new int[1001];
		
		for (int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
			res[a[i]] = 1;
		}
		for (int i = 0 ; i < m ; i++) {
			b[i] = sc.nextInt();
			res[b[i]] = 1;
		}
		for (int i = 0 ; i < 1001 ; i++) {
			if (res[i] == 1) {
				System.out.print(i + " ");
			}
		}
	}
}
