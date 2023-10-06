import java.util.Scanner;

public class J03019_Xau_Con {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String s = sc.next();
		String res = "";
		char tmp = 'a';
		for (int i = s.length()-1 ; i >= 0 ; i--) {
			if (s.charAt(i) >= tmp) {
				tmp = s.charAt(i);
				res = tmp + res;
			}
		}
		System.out.println(res);
	}
}
