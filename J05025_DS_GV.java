//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.Scanner;
//
//class GVhhh implements Comparable<GVhhh>{
//	private String ten,ma,mon;
//	
//	public static int stt = 1;
//
//	public GVhhh(String ten, String mon) {
//		this.ma = String.format("GV%02d",stt++);
//		this.ten = ten;
//		String[] s = mon.split("\\s+");
//		String tmp = "";
//		for (String i : s) {
//			tmp += i.substring(0,1).toUpperCase();
//		}
//		this.mon = tmp;
//	}
//	
//	@Override
//	public String toString () {
//		return ma + " " + ten + " " + mon;
//	}
//	
//	@Override
//	public int compareTo(GVhhh o) {
//		String s1[] = this.ten.split("\\s+");
//		int l1 = s1.length;
//		String s2[] = o.ten.split("\\s+");
//		int l2 = s2.length;
//		
//		if (s1[l1-1].compareTo(s2[l2-1]) == 0) return -o.ma.compareTo(this.ma);
//		return -s2[l2-1].compareTo(s1[l1-1]);
//	}
//	
//}
//public class J05025_DS_GV {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner (System.in);
//		int t = Integer.parseInt(sc.nextLine());
//		List<GVhhh> lis = new ArrayList<GVhhh>();
//		while (t-- > 0) {
//			String ten = sc.nextLine();
//			String mon = sc.nextLine();
////			GVhhh a = new GVhhh(ten,mon);
//			lis.add(new GVhhh(ten,mon));
//		}
//		
//		Collections.sort(lis);
//		for (GVhhh i : lis) {
//			System.out.println(i);
//		}
//	}
//}
//
////3
////Nguyen Manh Son
////Cong nghe phan mem
////Vu Hoai Nam
////Khoa hoc may tinh
////Dang Minh Tuan
////An toan thong tin