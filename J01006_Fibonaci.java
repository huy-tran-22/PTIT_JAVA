import java.util.Scanner;

public class J01006_Fibonaci {
public static Scanner sc = new Scanner(System.in);
public static void solve(long F[]) {
	F[0] = 0;
	F[1] = 1;
	F[2] = 1;
	for (int i = 3 ; i <= 92 ; i++) {
		F[i] = F[i-2] + F[i-1];
	}
}

public static void main(String[] args) {
	int t = sc.nextInt();
	while (t-- > 0) {
		int n = sc.nextInt();
		long F[];
		F = new long[93];
		solve(F);
		System.out.println(F[n]);
	}
}
}
