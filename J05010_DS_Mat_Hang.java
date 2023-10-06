import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class MatHang implements Comparable<MatHang>{
	private String ten,nhom;
	private int ma;
	private Float mua,ban,loi;
	
	public static int stt = 1;
	public MatHang(String ten, String nhom, float mua, float ban) {
		this.ten = ten;
		this.nhom = nhom;
		this.mua = mua;
		this.ban = ban;
		this.ma = stt++;
		this.loi = ban - mua;
	}
	
	@Override
	public String toString() {
		return String.format("%d %s %s %.2f",ma,ten,nhom,loi);
	}
	
	@Override
	public int compareTo(MatHang o) {
		return -(this.loi.compareTo(o.loi));
	}
	
	
	
}
public class J05010_DS_Mat_Hang {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		List<MatHang> lis = new ArrayList<MatHang>();
		int t = Integer.parseInt(sc.nextLine());
		while (t-- > 0) {
			String ten = sc.nextLine();
			String nhom = sc.nextLine();
			float mua = Float.parseFloat(sc.nextLine());
			float ban = Float.parseFloat(sc.nextLine());
			lis.add(new MatHang(ten,nhom,mua,ban));
		}
		
		Collections.sort(lis);
		
		for (MatHang i : lis) {
			System.out.println(i);
		}
	}
}

//May tinh SONY VAIO
//Dien tu
//16400
//17699
//Tu lanh Side by Side
//Dien lanh
//18300
//25999
//Banh Chocopie
//Tieu dung
//27.5
//37