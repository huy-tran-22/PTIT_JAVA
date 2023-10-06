import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Gamer implements Comparable<Gamer>{
	private String ma,ten,vao,ra;
	private int gio,phut,time;
	public Gamer(String ma, String ten, String vao, String ra) {
		this.ma = ma;
		this.ten = ten;
		this.vao = vao;
		this.ra = ra;
		
		String[] s1 = vao.split(":");
		int time_vao = Integer.parseInt(s1[0]) * 60 + Integer.parseInt(s1[1]);
		String[] s2 = ra.split(":");
		int time_ra = Integer.parseInt(s2[0]) * 60 + Integer.parseInt(s2[1]);
		
		this.time = time_ra - time_vao;
		
		this.gio = this.time / 60;
		this.phut = this.time % 60;
	
}
	
		@Override
		public int compareTo(Gamer o) {
			return -(this.time - o.time);
		}
		
		@Override
		public String toString(){
			return ma + " " + ten + " " + gio + " gio " + phut + " " + "phut"; 
		}
}
public class J05011_Tinh_Gio {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = Integer.parseInt(sc.nextLine());
		List<Gamer> lis = new ArrayList<Gamer>();
		while (t-- > 0) {
			String ma = sc.nextLine();
			String ten = sc.nextLine();
			String vao = sc.nextLine();
			String ra = sc.nextLine();
			Gamer a = new Gamer(ma, ten, vao, ra);
			lis.add(a);
		}
		Collections.sort(lis);
		for (Gamer i : lis) {
			System.out.println(i);
		}
	}
}


//3
//01T
//Nguyen Van An
//09:00
//10:30
//06T
//Hoang Van Nam
//15:30
//18:00
//02I
//Tran Hoa Binh
//09:05
//10:00