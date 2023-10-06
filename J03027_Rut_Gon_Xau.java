import java.util.Scanner;

public class J03027_Rut_Gon_Xau {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String s = sc.next();
		while (true) {
			boolean end = true;
			for (int i = 0 ; i <  s.length()-1 ; i++) {
				if (s.charAt(i) == s.charAt(i+1)) {
					s = s.substring(0,i) + s.substring(i+2 , s.length());
					end = false;
					break;
				}
			}
			if (end) {
				break;
			}
		}
		if (!s.isEmpty()) {
			System.out.println(s);
		}
		else {
			System.out.println("Empty String");
		}
	}
}
