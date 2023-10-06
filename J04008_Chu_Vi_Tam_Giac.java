import java.util.Scanner;

class Point{
	private float x,y;
	
	public Point(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public float getX() {
		return this.x;
	}
	
	public float getY() {
		return this.y;
	}
}

public class J04008_Chu_Vi_Tam_Giac {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			Point a = new Point(sc.nextFloat(),sc.nextFloat());
			Point b = new Point(sc.nextFloat(),sc.nextFloat());
			Point c = new Point(sc.nextFloat(),sc.nextFloat());
			
			double AB = Math.sqrt((a.getX() - b.getX())*(a.getX()-b.getX()) + (a.getY() - b.getY())*(a.getY() - b.getY()));
			double BC = Math.sqrt((c.getX() - b.getX())*(c.getX()-b.getX()) + (c.getY() - b.getY())*(c.getY() - b.getY()));
			double AC = Math.sqrt((a.getX() - c.getX())*(a.getX()-c.getX()) + (a.getY() - c.getY())*(a.getY() - c.getY()));

			if(AB + BC < AC || AB + AC < BC || AC + BC < AB || AB + BC == AC || AB + AC == BC || AC + BC == AB) {
				System.out.println("INVALID");
			}
			else {
				double ans = AB+AC+BC;
				System.out.printf("%.3f",ans);
			}
			System.out.println();
		}
	}
}
