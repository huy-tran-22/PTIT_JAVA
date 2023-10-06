
import java.util.Scanner;

public class J04007_Nhan_Vien_Class {
	public static String solve(String s) {
		if (s.length() == 1) {
			return s.toUpperCase();
		}
		return s.substring(0, 1).toUpperCase() + s.substring(1).toUpperCase();
 	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.nextLine().trim();
			String[] lis = s.split("\\s+");
			for (int i = 0 ; i < lis.length; i++) {
				lis[i] = solve(lis[i]);
			}
			System.out.println(String.join(" ", lis));
		}
		
	}
}
