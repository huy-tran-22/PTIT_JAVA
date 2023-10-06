import java.util.Scanner;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;


class Subject implements Comparable<Subject>{
	private String ma,ten,thi;
	
	public Subject(String ma, String ten, String thi) {
		this.ma = ma;
		this.ten = ten;
		this.thi = thi;
	}
	
	@Override
	public String toString () {
		return ma + " " + ten+ " " + thi;
	}
	
	@Override
	public int compareTo(Subject a) {
		return this.ma.compareTo(a.ma);
	}
}
public class J07058_DS_Mon_Thi {
	public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("MONHOC.in"));
		int t = Integer.parseInt(sc.nextLine());
		List <Subject> lis = new ArrayList<>(t);
		while (t-- > 0) {
			String ma = sc.nextLine();
			String ten = sc.nextLine();
			String thi = sc.nextLine();
			Subject tmp = new Subject(ma,ten,thi);
			lis.add(tmp);
		}
		Collections.sort(lis);
		for (Subject i : lis) {
			System.out.println(i);
		}
	}
}
