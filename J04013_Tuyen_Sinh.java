import java.util.Scanner;

class SinhVien{
	private String MSV,HT;
	private float toan,ly,hoa,ut;
	
	public SinhVien(String MSV,String HT,float toan,float ly,float hoa) {
		this.MSV = MSV;
		this.HT = HT;
		this.toan = toan;
		this.ly = ly;
		this.hoa = hoa;
		String s = this.MSV.substring(0,3);
		switch (s) {
			case ("KV1"):
				this.ut = 0.5f;
				break;
			case ("KV2"):
				this.ut = 1f;
				break;
			case ("KV3"):
				this.ut = 2.5f;
				break;
		}
	}
	
	public String tuyen_sinh() {
		double tong = this.toan*2 + this.ly + this.hoa + this.ut;
		if (tong >= 24f) {
			return "TRUNG TUYEN";
		}
		else {
			return "TRUOT";
		}
	}
	
	public String formatFloat (float x) {
		float inx = x * 10;
		inx = (int)inx;
		return inx % 10 == 0 ? String.format("%.0f", x): String.format("%.1f",x);
	}
	
	@Override
	public String toString(){
		float tong = toan*2 + ly + hoa;
		return this.MSV + " " + this.HT + " " + formatFloat(this.ut) + " " + formatFloat(tong) + " " + tuyen_sinh();
	}
}

public class J04013_Tuyen_Sinh {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String msv = sc.nextLine();
		String ht = sc.nextLine();
		float toan = sc.nextFloat();
		float ly = sc.nextFloat();
		float hoa = sc.nextFloat();
		SinhVien a = new SinhVien(msv,ht,toan,ly,hoa);
		System.out.println(a);
	}
}
