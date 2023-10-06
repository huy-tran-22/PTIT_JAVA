import java.util.Scanner;

class Sinh_Vien{
	private String ht,msv,ns,lop;
	private float gpa;
	
	public Sinh_Vien() {
		this.ht = "";
		this.lop = "";
		this.msv = "";
		this.ns = "";
		this.gpa = 0;
	}
	
	public void setHT(String ht) {
		this.ht = ht;
		this.msv = "B20DCCN001";
	}
	
	public void setLop(String lop) {
		this.lop = lop;
	}
	
	public void setGPA(float gpa) {
		this.gpa = gpa;
	}
	
	public void setNS(String ns) {
		this.ns = ns;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s %s %s %.2f", msv,ht,lop,ns,gpa);
	}
}
public class J04006_Sinh_vien {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Sinh_Vien a = new Sinh_Vien();
		a.setHT(sc.nextLine());
		a.setLop(sc.next());
		a.setNS(sc.next());
		a.setGPA(sc.nextFloat());
		System.out.println(a);
	}
}
