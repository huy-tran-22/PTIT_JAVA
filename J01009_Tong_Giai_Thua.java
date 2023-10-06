import java.util.Scanner;

public class J01009_Tong_Giai_Thua {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		long n = sc.nextLong();
		long k = 1,tong = 0;
		for (int i = 1 ; i <= n ; i++) {
			k *= i;
			tong += k;
		}
		System.out.println(tong);
	}
}
