import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


class NhomBT implements Comparable<NhomBT>{
	private int nhom;
	private String BT;
	private String ma,ten,sdt;

	public NhomBT( String ma, String ten, String sdt,int nhom) {
		this.ma = ma;
		this.ten = ten;
		this.sdt = sdt;
		this.nhom = nhom;

	}
	
	public int getNhom() {
		return this.nhom;
	}
	
	public void setBT(String s) {
		this.BT = s;
	}
	public String getBT() {
		return this.BT;
	}

	@Override 
	public String toString () {
		return ma + " " + ten + " " + sdt + " " + nhom + " " + BT;
	}
	
	@Override 
	public int compareTo(NhomBT o) {
		return this.ma.compareTo(o.ma);
	}
}
public class J06004_BT_Nhom {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();
		List<NhomBT> nhomBT = new ArrayList<NhomBT>();
		
		while (n-- > 0) {
			String ma = sc.nextLine();
			String ten = sc.nextLine();
			String sdt = sc.nextLine();
			int nhom = Integer.parseInt(sc.nextLine());
			NhomBT a = new NhomBT(ma,ten,sdt,nhom);
			nhomBT.add(a);
		}
		List<String> tmp = new ArrayList<String>();
		
		for (int i = 1 ; i <= m ; i++) {
			String s = sc.nextLine();
			tmp.add(s);
		}
		
		for (NhomBT i : nhomBT) {
			i.setBT(tmp.get(i.getNhom() - 1));
		}
		Collections.sort(nhomBT);
		for (NhomBT i : nhomBT) {
			System.out.println(i);
		}
		
	}
}


//5 2
//B17DTCN001
//Nguyen Chi  Linh
//0987345543
//1
//B17DTCN011
//Vu Viet Thang
//0981234567
//1
//B17DTCN023
//Pham Trong Thang
//0992123456
//1
//B17DTCN022
//Nguyen Van  Quyet
//0977865432
//2
//B17DTCN031
//Ngo Thanh Vien
//0912313111
//2
//Xay dung website ban dien thoai truc tuyen
//Xay dung ung dung quan ly benh nhan Covid-19


