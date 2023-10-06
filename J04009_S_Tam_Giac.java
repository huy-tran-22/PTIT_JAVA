import java.util.Scanner;

class Point {
	private double x,y;
	public Point() {
		x = 0; y = 0;
	}
	public Point(double xne, double yne) {
		this.x = xne;
		this.y = yne;
	}
	public Point(Point p) {
		this.x = p.x;
		this.y = p.y;
	}
	public double getX() {
		return this.x;
	}
	public double getY() {
		return this.y;
	}
	public double distance(Point p) {
		return Math.sqrt(Math.pow((x - p.x), 2)  + Math.pow((y - p.y),2)); 
	}
	public double distance2(Point p1, Point p2) {
		return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x)  + (p1.y - p2.y) *(p1.y - p2.y)); 
	}
}

public class J04009_S_Tam_Giac {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
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
				double S = Math.sqrt((a + b + c) * (a + b - c) * (a - b + c) * ( b + c - a)) / 4;
				System.out.printf("%.2f\n",S);
			}
			else System.out.println("INVALID");
			}
	}
}