import java.util.Scanner;


public class J04003_Phan_so {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		PhanSo a = new PhanSo(sc.nextLong(),sc.nextLong());
		a = PhanSo.RutGon(a);
		System.out.println(a);
	}
}
