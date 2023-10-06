import java.math.BigInteger;
import java.util.Scanner;

public class J03039_Chia_Het {
	public static int solve(BigInteger a, BigInteger b) {
		BigInteger c = new BigInteger("0");
		if (a.mod(b).compareTo(c) == 0) return 1;
		if (b.mod(a).compareTo(c) == 0) return 1;
		return 0;

	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			BigInteger a = new BigInteger(sc.next());
			BigInteger b = new BigInteger(sc.next());
			if (solve(a,b) == 1) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}
