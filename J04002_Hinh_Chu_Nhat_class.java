import java.util.Scanner;

class HCN{
	private double h,w;
	private String color;
	
	public HCN() {
		this.h = 1;
		this.w = 1;
	}
	
	public HCN(double w, double h, String color) {
		this.w = w;
		this.h = h;
		this.color = color;
	}
	
	public String setColor() {
		return this.color.substring(0,1).toUpperCase() + this.color.substring(1).toLowerCase();
	}
	
	public double getW() {
		return this.w;
	}
	
	public double getH() {
		return this.h;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public double s () {
		return this.h*this.w;
	}
	
	public double c() {
		return (this.h + this.w) * 2;
	}
	
	@Override
	public String toString() {
		return String.format("%d %d %s",(int)c(), (int)s(), setColor());
	}
}
public class J04002_Hinh_Chu_Nhat_class {
	public static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		double w = sc.nextDouble();
		double h = sc.nextDouble();
		String col = sc.next();
		if (w > 0 && h > 0) {
			HCN a = new HCN(w,h,col);
			System.out.println(a);
		}
		else {
			System.out.printf("INVALID");
		}
		System.out.println();
	}
}
