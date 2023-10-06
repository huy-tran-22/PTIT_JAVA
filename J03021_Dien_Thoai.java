import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J03021_Dien_Thoai {
	public static char solve(char x) {
		switch (x) {
		case 'A': 
		case 'B':
		case 'C':
			return '2';
		case 'D':
		case 'E':
		case 'F':
			return '3';
		case 'G':
		case 'H':
		case 'I':
			return '4';
		case 'J':
		case 'K':
		case 'L':
			return '5';
		case 'M':
		case 'N':
		case 'O':
			return '6';
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
			return '7';
		case 'T':
		case 'U':
		case 'V':
			return '8';
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
			return '9';
		}
		return '0';
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			s = s.toUpperCase();
			StringBuilder res = new  StringBuilder();
			for (int i = 0 ; i < s.length();  i ++) {
				res.append(solve(s.charAt(i)));
			}
			String tmp = res.reverse().toString();
			String tmp2 = res.reverse().toString();
			if (tmp2.compareTo(tmp) == 0) System.out.println("YES");
			else System.out.println("NO");
			
		}
	}
}
