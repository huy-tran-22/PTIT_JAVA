import java.util.Scanner;

class ThiSinh{
	private String ht,ns;
	private float d1,d2,d3;
	
	public ThiSinh(String ht,String ns,float d1,float d2,float d3) {
		this.ht = ht;
		this.ns = ns;
		this.d1 = d1;
		this.d2 = d2;
		this.d3 = d3;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s %.1f",ht,ns,d1+d2+d3);
	}
}
public class J04005_Thi_Sinh {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String ht = sc.nextLine();
		String ns = sc.next();
		float d1 = sc.nextFloat();
		float d2 = sc.nextFloat();
		float d3 = sc.nextFloat();
		ThiSinh a = new ThiSinh(ht,ns,d1,d2,d3);
		System.out.println(a);
	}
}
