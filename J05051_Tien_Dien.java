import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class TienDien{
	private String ma,stt;
	private int cu,moi,hs;
	private float thanhTien,phuTroi,tong;
	public int cnt = 1;
	
	public TienDien(String ma, int cu, int moi) {
		this.stt = "KH" + String.format("%02",cnt++);
		this.ma = ma;
		this.cu = cu;
		this.moi = moi;
	}
	
	public void setHs() {
		switch(this.ma){
		case "KD":{
			this.hs = 3;
			break;
		}
		case "NN":{
			this.hs = 5;
			break;
		}
		case "TT":{
			this.hs = 4;
			break;
		}
		case "CN":{
			this.hs = 2;
		}
	}
	}
		
	 public void setThanhTien() {
		this.thanhTien = (moi - cu) * this.hs * 550;

	}
	
	public void setPhuTro() {
		if (moi - cu < 50) this.phuTroi = 0;
		else if (moi - cu <= 100) this.phuTroi = Math.round(this.thanhTien * 35 / 100);
		else this.phuTroi = Math.round(this.thanhTien);
		
		this.tong = this.thanhTien + this.phuTroi;
	}
	
	@Override
	public String toString() {
		return String.format("%s %d %.0f %.0f %.0f",stt,hs,thanhTien,phuTroi,tong);
	}
	
}
public class J05051_Tien_Dien {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		List<TienDien> lis = new ArrayList<TienDien>();
		int t = Integer.parseInt(sc.nextLine());
		
		while (t-- > 0) {
			String ma = sc.nextLine();
			int cu = Integer.parseInt(sc.nextLine());
			int moi = Integer.parseInt(sc.nextLine());
			TienDien a = new TienDien(ma, cu, moi);
			a.setHs();
			a.setThanhTien();
			a.setPhuTro();
			lis.add(a);
		}
		for (TienDien i : lis) {
			System.out.println(i);
		}
	}
}
//3
//KD
//400
//555
//NN
//58
//400
//CN
//150
//700