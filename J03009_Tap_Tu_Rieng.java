import java.util.Scanner;
import java.util.HashSet;

public class J03009_Tap_Tu_Rieng {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = Integer.parseInt(sc.nextLine());
		while (t-- > 0) {
			String[] s = sc.nextLine().split("\\s+");
			String s2 = sc.nextLine();
			HashSet<String> se = new HashSet<String>();
			for (String i : s) {
				if (!s2.contains(i)) {
					se.add(i);
				}
			}
			for (String i : se) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
