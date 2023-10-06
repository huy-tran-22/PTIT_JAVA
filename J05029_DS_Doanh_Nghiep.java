import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class DoanhNghiep implements Comparable<DoanhNghiep>{
	private String ma,ten;
	private int soLuong;
	
	public DoanhNghiep(String ma, String ten, int soLuong) {
		this.ma = ma;
		this.ten = ten;
		this.soLuong = soLuong;
	}
	public int getSo() {
		return this.soLuong;
	}
	
	@Override
	public String toString() {
		return ma + " " + ten + " " + soLuong;
	}
	
	@Override
	public int compareTo(DoanhNghiep a) {
		if (a.soLuong == this.soLuong) return this.ma.compareTo(a.ma);
		return a.soLuong - this.soLuong;
	}
	
}
public class J05029_DS_Doanh_Nghiep {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int t = Integer.parseInt(sc.nextLine());
		List<DoanhNghiep> lis = new ArrayList<DoanhNghiep>();
		while (t-- > 0) {
			String ma = sc.nextLine();
			String ten = sc.nextLine();
			int sl = Integer.parseInt(sc.nextLine());
			lis.add(new DoanhNghiep(ma, ten, sl));
		}
		Collections.sort(lis);
		int n = sc.nextInt();
		while (n-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();	
			System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + a +" DEN " + b + " SINH VIEN:");
			for (DoanhNghiep i : lis) {
				if (i.getSo() >= a && i.getSo() <= b) System.out.println(i);
			}
	}
}
}
//4
//VIETTEL
//TAP DOAN VIEN THONG QUAN DOI VIETTEL
//40
//FSOFT
//CONG TY TNHH PHAN MEM FPT - FPT SOFTWARE
//300
//VNPT
//TAP DOAN BUU CHINH VIEN THONG VIET NAM
//200
//SUN
//SUN*
//50
//1
//30 50