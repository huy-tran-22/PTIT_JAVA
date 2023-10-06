import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class HocBong implements Comparable<HocBong>{
	private String ten,loai;
	private Float gpa;
	private int drl;
	public HocBong(String ten, Float gpa, int drl) {
		super();
		this.ten = ten;
		this.gpa = gpa;
		this.drl = drl;
		if (gpa >= 3.6 && drl >= 90) this.loai = "XUATSAC";
		else if (gpa >= 3.2 && drl >= 80) this.loai = "GIOI";
		else if (gpa >= 2.5 && drl >= 70) this.loai = "KHA";
		else this.loai = "KHONG";
	}
	public void setHB() {
		this.loai = "KHONG";
	}
	
	public String getMa() {
		return this.ten;
	}
	
	public float getGPA() {
		return this.gpa;
	}
	@Override
	public String toString() {
		return ten + ": " + loai; 
	}
	
	public int compareTo(HocBong o) {
		return o.gpa.compareTo(this.gpa);
	}
	
}
public class J05062_Hoc_Bong {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		sc.nextLine();
		List<HocBong> lis = new ArrayList<HocBong>();
		List<HocBong> ans = new ArrayList<HocBong>();
 		for (int i = 0 ; i < n ; i++) {
 			String ten = sc.nextLine();
 			float gpa = Float.parseFloat(sc.next());
 			int drl = Integer.parseInt(sc.next());
 			sc.nextLine();
 			lis.add(new HocBong(ten,gpa,drl));
 			ans.add(new HocBong(ten,gpa,drl));
		}
 		Collections.sort(lis);
 		float ss = lis.get(k-1).getGPA();
 		int i = k;
 		while (i < n) {
 			if (lis.get(i).getGPA() == ss) i++;
 			else {
 				lis.get(i).setHB();
 				i++;
 			}
 		}

 		
 		for (HocBong j : ans) {
 			for (HocBong l : lis) {
 				if(j.getMa().equals(l.getMa())) {
 					System.out.println(l);
 				}
 		}
	}
}
}
//3 2
//Nguyen Van Nam
//3.59 75
//Tran Hong Ngoc
//3.61 90
//Do Van An
//3.22 90