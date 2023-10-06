import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class HocSinh{
	private String ten,ns;
	private float d1,d2,d3,tong;
	private int ma;
	public static int stt = 1;
	public HocSinh(String ten, String ns, float d1, float d2, float d3) {
		this.ten = ten;
		this.ns = ns;
		this.d1 = d1;
		this.d2 = d2;
		this.d3 = d3;
		this.ma = stt++;
		this.tong = d1 + d2 + d3;
	}
	
	public float getTong() {
		return tong;
	}
	@Override
	public String toString() {
		return String.format("%d %s %s %.1f",ma,ten,ns,tong);
	}
}

public class J05009_ThuKhoa {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = Integer.parseInt(sc.nextLine());
		List<HocSinh> lis = new ArrayList<HocSinh>();
		while (t-- > 0) {
			String ten = sc.nextLine();
			String ns = sc.nextLine();
			float d1 = Float.parseFloat(sc.nextLine());
			float d2 = Float.parseFloat(sc.nextLine());
			float d3 = Float.parseFloat(sc.nextLine());
			lis.add(new HocSinh(ten, ns, d1, d2, d3));
		}
		float max = 0;
		for (HocSinh i : lis) {
			if (i.getTong() > max) max = i.getTong();
		}
		for (HocSinh i : lis) {
			if (i.getTong() == max) System.out.println(i);
		}
		
	}
}

//Nguyen Van A
//12/12/1994
//3.5
//7.0
//5.5
//Nguyen Van B
//1/9/1994
//7.5
//9.5
//9.5
//Nguyen Van C
//6/7/1994
//8.5
//9.5
//8.5
