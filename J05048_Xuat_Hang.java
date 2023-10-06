import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Hangl implements Comparable<Hangl>{
	private String ma;
	private int slXuat,slNhap;
	private Long donGia,tong,thue;
		
	public Hangl(String ma, int slNhap) {
		this.ma = ma;
		this.slNhap = slNhap;
		
		String md = ma.substring(0,1);
		String mc = ma.substring(4,5);
		
		switch(md) {
		case "A":{
			this.slXuat = Math.round((float)slNhap * 60 / 100);
			break;
		}
		case "B":
			this.slXuat = Math.round((float)slNhap * 70 / 100);
			break;
		}
		
		switch(mc) {
		case "N":{
			this.donGia = (long)135000;
			break;
		}
		case "Y":
			this.donGia = (long)110000;
			break;
		}
		
		this.tong = this.slXuat * this.donGia;
		
		
		if (md.equals("A") && mc.equals("Y")) this.thue = Math.round((double)this.tong / 100 * 8);
		else if (md.equals("A") && mc.equals("N")) this.thue = Math.round((double)this.tong / 100 * 11);
		else if (md.equals("B") && mc.equals("Y")) this.thue = Math.round((double)this.tong / 100 * 17);
		else if (md.equals("B") && mc.equals("N")) this.thue = Math.round((double)this.tong / 100 * 22);
		
	}
	
	public String getMa() {
		return ma;
	}

	@Override
	public String toString() {
		return String.format("%s %d %d %d %d %d",ma,slNhap,slXuat,donGia,tong,thue);
	}
	
	@Override
	public int compareTo(Hangl o) {
		return -(this.thue.compareTo(o.thue));
	}
	
}
public class J05048_Xuat_Hang {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = Integer.parseInt(sc.nextLine());
		List<Hangl> lis = new ArrayList<Hangl>();
		while (t-- > 0) {
			String ma = sc.nextLine();
			int slNhap = Integer.parseInt(sc.nextLine());
			lis.add(new Hangl(ma,slNhap));
		}		
		for (Hangl i : lis) {
				System.out.println(i);
		
		}
		
	}
}

//3
//A001Y
//1000
//B012N
//2500
//B003Y
//4582
//B