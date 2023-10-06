import java.util.Scanner;

public class J01013_Tong_Uoc_So {
	public static Scanner sc = new Scanner(System.in);
	public static int USNT(int n) {
		int tong = 0;
		for (int i = 2 ; i <= Math.sqrt(n) ; i++) {
			while (n % i == 0) {
				tong += i;
				n/=i;
			}
		}
		if (n > 1) tong += n;
		return tong;
	}
	public static void main(String[] args) {
		int t = sc.nextInt();
		int res = 0;
		while (t-- > 0) {
			int n = sc.nextInt();
			res += USNT(n);
		}
		System.out.println(res);
	}
}
