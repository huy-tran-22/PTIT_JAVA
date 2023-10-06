import java.util.Scanner;

public class J01011_GCD_LCM {
	public static Scanner sc = new Scanner(System.in);
	public static long GCD(long a, long b) {
        while (b != 0) {
        	long tmp = a % b;
        	a = b;
        	b = tmp;
        }
        return a;
	}
	public static void main(String[] args) {
		int t = sc.nextInt();
		while (t-- > 0) {
			long a = sc.nextInt();long b = sc.nextInt();
			long c = GCD(a,b);
			System.out.printf("%d %d\n",a*b/c,c);
		}
	}
}
