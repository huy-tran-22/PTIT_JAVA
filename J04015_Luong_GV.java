import java.util.Scanner;

class GV{
	private String mn,ht;
	private int pc,bl,luong,thunhap;
	
	public GV(String mn,String ht, int luong) {
		this.mn = mn;
		this.ht = ht;
		this.luong = luong;
		String PC = mn.substring(0,2);
		switch (PC) {
		case "HT":{
			this.pc = 2000000;
			break;
		}
		case "HP":{
			this.pc = 900000;
			break;
		}
		case "GV":{
			this.pc = 500000;
			break;
		}
	}
		this.bl = Integer.parseInt(mn.substring(2,4));
		this.thunhap = this.luong * this.bl + this.pc;
}
		
	@Override
	public String toString() {
		return String.format("%s %s %d %d %d", mn,ht,bl,pc,thunhap);
	}
}
public class J04015_Luong_GV {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String mn = sc.nextLine();
		String ht = sc.nextLine();
		int luong = sc.nextInt();
		GV a = new GV(mn,ht,luong);
		System.out.println(a);
	}
}
