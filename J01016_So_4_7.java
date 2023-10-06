import java.util.Scanner;

public class J01016_So_4_7 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String s = sc.nextLine();
		int res = 0;
		for (int i = 0 ; i < s.length() ; i++) {
			char x = s.charAt(i);
			if (x == '4' || x == '7') res++;
		}
		if (res == 4 || res == 7) System.out.println("YES");
		else System.out.println("NO");
	}
}
