import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Hang implements Comparable <Hang>{
    public static int NUM_PRODUCT = 1;
	private HangData data = new HangData();

	public Hang(String ten,String dv, int mua, int ban) {
        this.data.ma = "MH" + String.format("%03d", NUM_PRODUCT++);
        this.data.ten = ten;
		this.data.dv = dv;
		this.data.mua = mua;
		this.data.ban = ban;
		this.data.loi = ban - mua;
	}
	
	public int getLoi() {
		return data.loi;
	}
	@Override
	public String toString() {
		return String.format("%s %s %s %d %d %d",data.ma,data.ten,data.dv,data.mua,data.ban,data.loi);
	}
	
	@Override
	public int compareTo(Hang tmp) {
			return tmp.data.loi - this.data.loi;

}
}

public class J05081_DS_Mat_Hang_Class {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());
		
        List<Hang> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String unit = sc.nextLine();
            int buyingPrice = Integer.parseInt(sc.nextLine());
            int sellingPrice = Integer.parseInt(sc.nextLine());
            Hang p = new Hang(name, unit, buyingPrice, sellingPrice);
            list.add(p);
        }
		
		Collections.sort(list);
		for (Hang i : list) {
			System.out.println(i);
	}
}}

