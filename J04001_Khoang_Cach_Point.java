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

public class J04001_Khoang_Cach_Point {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int t = sc .nextInt();
	while (t-- > 0) {
		Point a = new Point(sc.nextDouble(), sc.nextDouble());
		Point b = new Point(sc.nextDouble(), sc.nextDouble());
		double d = Math.sqrt(Math.pow(a.getX() - b.getX(),2) + Math.pow(a.getY() - b.getY(),2));
		System.out.printf("%.4f",d);
		System.out.println();
	}
}
}
