import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J02037_Day_Uu_The {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = Integer.parseInt(sc.nextLine());
		while (t-- > 0) {
			String s = sc.nextLine();
			String[] tmp = s.split("\\s+");
			int[] a = new int[tmp.length];
			int c = 0;
			int l = 0;
			for (int i = 0 ; i < a.length ; i++) {
				a[i] = Integer.parseInt(tmp[i]);
				if (a[i] % 2 == 0) c++;
				else l++;
			}
			if (a.length % 2 == 0 && c > l || a.length % 2 == 1 && l > c) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}
