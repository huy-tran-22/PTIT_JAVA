import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class DonHang{
	private String ten,ma,loai,stt;
	private double gia,tong,sale;
	private int sluong;
	
	public DonHang(String ten, String ma, double gia, int sluong) {
		this.ten = ten;
		this.ma = ma;
		this.gia = gia;
		this.sluong = sluong;
		this.stt = ma.substring(1,4);
		this.loai = ma.substring(4,5);
		
	}
	
	public void setSale() {
		switch(loai) {
		case "1":{
			this.sale = 0.5 * this.gia * this.sluong;
			break;
		}
		case "2":{
			this.sale = 0.3 * this.gia * this.sluong;
			break;
		}
		}
	}
	
	public void setTong() {
		this.tong = this.gia * this.sluong - this.sale;
	}
	@Override
	public String toString() {
		return String.format("%s %s %s %.0f %.0f",ten,ma,stt,sale,tong);
	}
	
	
}
public class J05052_Tra_Cuu_Don_Hang {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		List<DonHang> lis = new ArrayList<DonHang>();
		int t = Integer.parseInt(sc.nextLine());
		while (t-- > 0) {
			String ten = sc.nextLine();
			String ma = sc.nextLine();
			double gia = Double.parseDouble(sc.nextLine());
			int sluong = Integer.parseInt(sc.nextLine());
			DonHang a = new DonHang(ten, ma, gia, sluong);
			a.setSale();
			a.setTong();
			System.out.println(a);
		}
	}
}

//Kaki 2
//K0252
//80000
//15
//Jean 1
//J2011
//200000
//24
//Jean 2
//J0982
//150000
//12
