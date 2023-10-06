import java.util.Scanner;

class SoPhuc{
	private int real,img;
	
	public SoPhuc(int real, int img) {
		this.real = real;
		this.img = img;
	}
	
	public SoPhuc tong(SoPhuc a) {
		SoPhuc b = new SoPhuc(0,0);
		b.real = this.real + a.real;
		b.img = this.img + a.img;
		return b;
	}
	
	public SoPhuc nhan(SoPhuc a) {
		SoPhuc b = new SoPhuc(0,0);
		b.real = this.real * a.real - this.img * a.img;
		b.img = this.real * a.img + this.img * a.real;
		return b;
		
	}
	
	@Override
	public String toString() {
		return String.format("%d + %di", real,img);
	}
	
}
public class J04018_So_Phuc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		while (t-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			
			SoPhuc A = new SoPhuc(a,b);
			SoPhuc B = new SoPhuc(c,d);
			
			SoPhuc C = A.tong(B);
			C = C.nhan(A);
			
			SoPhuc D = A.tong(B);
			D = D.nhan(D);
			
			System.out.println(C + ", " + D);
			
		}
	}
}
