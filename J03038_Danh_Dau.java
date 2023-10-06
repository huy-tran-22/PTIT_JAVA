import java.util.HashSet;
import java.util.Scanner;

public class J03038_Danh_Dau {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		HashSet<String> se = new HashSet<>();
		for (int i = 0 ; i < s.length() ; i++) {
			se.add(String.valueOf(s.charAt(i)));
		}
		System.out.println(se.size());
	}
}
