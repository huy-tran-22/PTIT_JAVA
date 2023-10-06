import java.math.BigInteger;
import java.util.Scanner;

public class J03015_Hieu_SN_Lon {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		BigInteger a = new BigInteger(sc.next());
		BigInteger b = new BigInteger(sc.next());
		
		System.out.println(a.subtract(b));
	}
}
