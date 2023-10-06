import java.util.Scanner;


public class J04004_Tong_Phan_So {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		long a1 = sc.nextLong();
		long a2 = sc.nextLong();
		long b1 = sc.nextLong();
		long b2 = sc.nextLong();
		PhanSo a = new PhanSo(a1*b2 + b1*a2, a2*b2);
		a = PhanSo.RutGon(a);
		System.out.println(a);
	}
}
