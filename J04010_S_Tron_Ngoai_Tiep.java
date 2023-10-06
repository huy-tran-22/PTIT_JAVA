import java.util.Scanner;

public class J04010_S_Tron_Ngoai_Tiep {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			Point lis[] = new Point[3];
			for (int i = 0 ; i < 3 ; i++) {
				double x = sc.nextDouble();
				double y = sc.nextDouble();
				lis[i] = new Point(x,y);
			}
			double a = lis[0].distance(lis[1]);
			double b = lis[0].distance(lis[2]);
			double c = lis[1].distance(lis[2]);
			if (a+b > c && a+c > b && b+c > a) {
				double s = 1/4f * Math.sqrt((a + b + c)*(a + b - c)*(b + c - a)*(c + a - b));
				double R = a*b*c/(4f * s);
				double ans = Math.PI * R * R;
				System.out.printf("%.3f\n",ans);
			}
			else {
				System.out.println("INVALID");
			}
		}
	}
}
