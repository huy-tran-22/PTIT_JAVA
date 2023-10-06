//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.Scanner;
//
//class diem implements Comparable<diem>{
//	private String ma,ten,lop;
//	private float[] diem;
//	public diem(String ma, String ten, String lop, float[] diem) {
//		super();
//		this.ma = ma;
//		this.ten = ten;
//		this.lop = lop;
//		this.diem = diem;
//	}
//	
//	@Override
//	public String toString() {
//		String tmp = "";
//		for (float i : diem) {
//			tmp += String.format("%.1f ",i);
//		}
//		return ma + " " + ten + " " + lop + " " + tmp; 
//	}
//	
//	@Override
//	public int compareTo(diem o) {
//		return this.ma.compareTo(o.ma);
//	}
//	
//}
//public class J05030_Diem_TP {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int t = Integer.parseInt(sc.nextLine());
//		List <diem> lis = new ArrayList<diem>();
//		for (int k = 0 ; k < t ; k++) {
//			String ma = sc.nextLine();
//			String ten = sc.nextLine();
//			String lop = sc.nextLine();
//			float[] tmp = new float[3];
//			for (int i = 0 ; i < 3 ; i ++) {
//				tmp[i] = Float.parseFloat(sc.nextLine());
//			}
//			lis.add(new diem(ma,ten,lop,tmp));
//		}
//		Collections.sort(lis);
//		for (int i = 1 ; i <= t ; i++) {
//			System.out.print(i + " ");
//			System.out.println(lis.get(i-1));
//		}
//		
//	}
//}
//
////3
////B20DCCN999
////Nguyen Van An
////D20CQCN04-B
////10.0
////9.0
////8.0
////B20DCAT001
////Le Van Nam
////D20CQAT02-B
////6.0
////6.0
////4.0
////B20DCCN111
////Tran Hoa Binh
////D20CQCN04-B
////9.0
////5.0
////6.0