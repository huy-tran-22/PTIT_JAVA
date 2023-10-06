import java.util.Scanner;
import java.util.*;
public class J03010_Email {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = Integer.parseInt(sc.nextLine());
		List <String> lis = new ArrayList <>();
		HashSet <String> se = new HashSet<String>(); 
		while (t-- > 0) {
			String[] s = sc.nextLine().trim().split("\\s+");
			String tmp = s[s.length-1].toLowerCase();
			for (int i = 0 ; i < s.length-1 ; i++) {
				tmp += s[i].toLowerCase().charAt(0);
			}
			lis.add(tmp);
			int cnt = Collections.frequency(lis, tmp);
			tmp += (cnt == 1 ? "" : cnt) + "@ptit.edu.vn";
			System.out.println(tmp);
		}
	}
}
