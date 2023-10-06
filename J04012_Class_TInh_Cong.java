import java.util.Scanner;


class NhanVien {
	private String MNV, Name,Position;
	private int Date,Salary;
	
	public NhanVien(String name, int luong, int ngay, String pos) {
		this.Name = name;
		this.Salary = luong;
		this.Date = ngay;
		this.Position = pos;
		this.MNV = "NV01";
	}
	
	public void TinhCong() {
		int luong = this.Salary * this.Date;
		int thuong = 0;
		if (this.Date < 22) thuong = 0;
		else if (this.Date >= 22 && this.Date < 25) thuong = luong / 10;
		else thuong = luong / 5;
		int pc = 0;
		switch (this.Position) {
			case "GD": 
				pc = 250000;
				break;
			case "PGD":
				pc = 200000;
				break;
			case "TP":
				pc = 180000;
				break;
			case "NV":
				pc = 150000;
				break;
		}
		int thu_nhap = luong + thuong + pc;
		System.out.println(this.MNV + " " + this.Name + " " + luong + " " + thuong + " " + pc + " " + thu_nhap);
	}
	
}

public class J04012_Class_TInh_Cong {
	public static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		String s = sc.nextLine();
		int luong = sc.nextInt();
		int ngay = sc.nextInt();
		String pos = sc.next();
		NhanVien a = new NhanVien(s,luong,ngay,pos);
		a.TinhCong();
		
	}
}
