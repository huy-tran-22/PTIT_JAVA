import java.util.*;

public class J02034_Bo_Sung_So {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int max = 0;
		for (int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
			if (a[i] > max) {
				max = a[i];
			}
		}

		int res[] = new int[max+1];
		for (int i : a) {
			res[i] = 1;
		}
		int ok = 1;
		for (int i = 1 ; i <= max ; i++) {
			if (res[i] != 1) {
				ok = 0;
				System.out.println(i);
			}
		}
		if (ok == 1) {
			System.out.println("Excellent!");
		}
		
	}
}
