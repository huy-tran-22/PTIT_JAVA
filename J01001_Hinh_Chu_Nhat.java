import java.util.Scanner;

public class J01001_Hinh_Chu_Nhat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a <= 0 || b == 0) {
			System.out.println("0");
		}
		else {
			System.out.println((2*a + 2*b) + " " + (a*b));
		}
	}
}