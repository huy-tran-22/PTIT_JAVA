import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class time implements Comparable<time>{
	private int gio,phut,giay;
	
	public time() {
		
	}
	
	public time(int gio, int phut, int giay) {
		this.gio = gio;
		this.phut = phut;
		this.giay = giay;
	}
	
	public int getH() {
		return gio;
	}
	
	public int getM() {
		return phut;
	}
	
	public int getS() {
		return giay;
	}
	
	public int getTime() {
		return gio * 3600 + phut * 60 + giay;
	}
	
	@Override
	public String toString() {
		return gio + " " + phut + " " + giay; 
	}
	
	@Override	
	public int compareTo(time tmp) {
		int s1 = gio * 3600 + phut * 60 + giay;
		int s2 = tmp.getH() * 3600 + tmp.getM() * 60 + tmp.getS();
		return s1 - s2;
	}
	

}

public class J05033_SX_Thoi_Gian {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		List <time> a = new ArrayList<>(t);
		for (int i = 0 ; i < t ; i++) {
			int gio = sc.nextInt();
			int phut = sc.nextInt();
			int giay = sc.nextInt();
			time tmp = new time (gio,phut,giay);
			a.add(tmp);
		}
		
		Collections.sort(a);

		for (int i = 0 ; i < a.size() ; i++) {
			System.out.println(a.get(i));
		}
	}
}
