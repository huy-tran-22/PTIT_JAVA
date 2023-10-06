//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.Scanner;
//
//class svhhh implements Comparable<svhhh>{
//	private String ma,ten,lop,mail;
//
//	public svhhh(String ma, String ten, String lop, String mail) {
//		this.ma = ma;
//		this.ten = ten;
//		this.lop = lop;
//		this.mail = mail;
//	}
//	
//	public String getLop() {
//		return lop;
//	}
//	
//	@Override
//	public int compareTo(svhhh o) {
//		if (this.lop.equals(o.lop) == true) return this.ma.compareTo(o.ma);
//		return this.lop.compareTo(o.lop);
//	}
//	@Override
//	public String toString () {
//		return ma + " " + ten +" " + lop + " " + mail;
//	}
//}
//public class J05023_SX_SV {	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner (System.in);
//		int t = Integer.parseInt(sc.nextLine());
//		List<svhhh> lis = new ArrayList<svhhh>();
//		while (t-- > 0) {
//			String ma = sc.nextLine();
//			String ten = sc.nextLine();
//			String lop = sc.nextLine();
//			String mail = sc.nextLine();
//			lis.add(new svhhh(ma,ten,lop,mail));
//
//		}
//		int n = Integer.parseInt(sc.nextLine());
//		while (n-- > 0) {
//		String s = sc.nextLine();
//		System.out.printf("DANH SACH SINH VIEN KHOA %s:",s);
//		System.out.println();
//		for (svhhh i : lis) {
//			if (i.getLop().substring(1,3).equals(s.substring(2,4)) == true) {
//				System.out.println(i);
//			}
//		}
//	}
//
//}}
//
////4
////B16DCCN011
////Nguyen Trong Duc Anh
////D16CNPM1
////sv1@stu.ptit.edu.vn
////B15DCCN215
////To Ngoc Hieu
////D15CNPM3
////sv2@stu.ptit.edu.vn
////B15DCKT150
////Nguyen Ngoc Son
////D15CQKT02-B
////sv3@stu.ptit.edu.vn
////B15DCKT199
////Nguyen Trong Tung
////D15CQKT02-B
////sv4@stu.ptit.edu.vn
////1
////2015