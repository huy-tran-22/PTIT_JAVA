import java.util.Scanner;

public class J01002_Tong_N_So {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t -- > 0) {
			long n = sc.nextLong();
			long tong = (n * (n+1))/2;
			System.out.println(tong);
		}
	}
}
