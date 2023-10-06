import java.util.Scanner;

class PhanSo{
	private long tu,mau;
	
	public long getTu() {
		return this.tu;
	}
	public long getMau() {
		return this.mau;
	}
	
	public PhanSo(long tu, long mau) {
		this.tu = tu;
		this.mau = mau;
	}	
	
	public static long GCD (long a, long b) {
		if (a == 0 || b == 0) return a+b;
		while (b != 0) {
			long tmp = a % b;
			a = b;
			b = tmp;
		}
		return a;
	}
	
	public static PhanSo RutGon(PhanSo a) {
		long tmp = GCD(a.tu,a.mau);
		PhanSo ans = new PhanSo(a.tu/tmp , a.mau/tmp);
		return ans;
	}
	
	@Override
	public String toString() {
		return tu + "/" + mau;
	}
	
	
}

public class J04014_Phan_So {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while ( t-- > 0) {
			PhanSo a = new PhanSo(sc.nextInt(), sc.nextInt());
			PhanSo b = new PhanSo(sc.nextInt(), sc.nextInt());
			PhanSo c = new PhanSo((long)Math.pow(a.getTu()*b.getMau() + b.getTu()*a.getMau(), 2), (long)Math.pow(a.getMau()*b.getMau(),2));
			c = PhanSo.RutGon(c);
			PhanSo d = new PhanSo(a.getTu()*b.getTu()*c.getTu(), a.getMau()*b.getMau()*c.getMau());
			d = PhanSo.RutGon(d);
			System.out.println(c + " " + d);
				
		}
	}
}
