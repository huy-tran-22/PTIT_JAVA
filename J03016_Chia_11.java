import java.math.BigInteger;
import java.util.Scanner;

public class J03016_Chia_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			BigInteger a = new BigInteger(sc.next());
			BigInteger tmp = new BigInteger("11");
			BigInteger tmp2 = new BigInteger("0");
			System.out.println(a.mod(tmp).equals(tmp2) ? "1" : "0");
		}
	}
}
