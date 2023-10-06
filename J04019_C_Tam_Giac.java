import java.util.Scanner;

class 	{
	private float x,y;

	public Point(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	
	public static Point nextPoint(Scanner sc) {
		return new Point(sc.nextFloat(),sc.nextFloat());
	}
}

class Triangle {
	private Point a,b,c;

	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}
	
	public float Canh(Point a , Point b) {
		return (float)Math.sqrt((a.getX() - b.getX())*(a.getX() - b.getX()) + (a.getY() - b.getY()) * (a.getY() - b.getY()));
	}
	
	public boolean valid () {
		float AB = Canh(this.getA(),this.getB());
		float AC = Canh(this.getA(),this.getC());
		float BC = Canh(this.getB(),this.getC());
		
		if (AB >= AC + BC || AC >= AB + BC || BC >= AC + AB) {
			return false;
		}
		
		return true;
		
	}
	
	public String getPerimeter() {
		float AB = Canh(this.getA(),this.getB());
		float AC = Canh(this.getA(),this.getC());
		float BC = Canh(this.getB(),this.getC());
		
		float c = AB + AC + BC;
		return String.format("%.3f\n",c);
	}

}


public class J04019_C_Tam_Giac {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
}
