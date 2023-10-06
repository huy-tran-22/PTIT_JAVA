//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Collections;
//import java.util.List;
//import java.util.Scanner;
//
//class TTS implements Comparable<TTS>{
//	private String ma,ten,lop,mail,doanhNghiep,stt;
//	
//	public static int Stt = 1;
//
//	public TTS(String ma, String ten, String lop, String mail, String doanhNghiep) {
//		super();
//		this.ma = ma;
//		this.ten = ten;
//		this.lop = lop;
//		this.mail = mail;
//		this.doanhNghiep = doanhNghiep;
//		this.stt = String.format("%d",Stt++);
//	}
//
//	public String getDN() {
//		return this.doanhNghiep;
//	}
//	@Override
//	public String toString() {
//		return String.format("%s %s %s %s %s %s",stt,ma,ten,lop,mail,doanhNghiep);
//	}
//	@Override
//	public int compareTo(TTS o) {
//		return this.ten.compareTo(o.ten);
//	}
//	
//}
//public class J05034_TTS {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int t = Integer.parseInt(sc.nextLine());
//		List<TTS> lis = new ArrayList<TTS>();
//		while (t-- > 0) {
//			String ma = sc.nextLine();
//			String ten = sc.nextLine();
//			String lop = sc.nextLine();
//			String mail = sc.nextLine();
//			String dn = sc.nextLine();
//			lis.add(new TTS(ma,ten,lop,mail,dn));
//		}
//		Collections.sort(lis);
//		int k = Integer.parseInt(sc.nextLine());
//		while (k-- > 0) {
//			String tmp = sc.nextLine();
//			for (TTS i : lis) {
//				if (i.getDN().equals(tmp) == true) System.out.println(i);
//			}
//		}
//	}
//}
//
////6
////B17DCCN016 
////Le Khac Tuan Anh 
////D17HTTT2   
////test1@stu.ptit.edu.vn
////VIETTEL
////B17DCCN107 
////Dao Thanh Dat    
////D17CNPM5   
////test2@stu.ptit.edu.vn
////FPT
////B17DCAT092 
////Cao Danh Huy     
////D17CQAT04-B
////test3@stu.ptit.edu.vn
////FPT
////B17DCCN388 
////Cao Sy Hai Long  
////D17CNPM2   
////test4@stu.ptit.edu.vn
////VNPT
////B17DCCN461 
////Dinh Quang Nghia 
////D17CNPM2   
////test5@stu.ptit.edu.vn
////FPT
////B17DCCN554 
////Bui Xuan Thai    
////D17CNPM1   
////test6@stu.ptit.edu.vn
////GAMELOFT
////1
////FPT
//
//
