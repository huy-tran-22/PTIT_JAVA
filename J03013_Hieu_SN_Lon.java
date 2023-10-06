import java.math.BigInteger;
import java.util.Scanner;

public class J03013_Hieu_SN_Lon {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			BigInteger a = new BigInteger(sc.next());
			BigInteger b = new BigInteger(sc.next());
			BigInteger c = a.subtract(b).abs();
			String d = c.toString(); 
			int cnt = d.length();
			int maxlen = Math.max(a.toString().length(),b.toString().length());
			while (cnt < maxlen) {
				System.out.print("0");
				cnt++;
			}
			System.out.println(d);
					
		}
	}
}
