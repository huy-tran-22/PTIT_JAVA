import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


class Diemhhh implements Comparable<Diemhhh>{
	private String ten,hocluc,ma;
	private Float avg;
	
	public static int stt = 1;
	
	public Diemhhh(String ten, float[]l ) {
		this.ten = ten;
		this.ma = String.format("HS%02d",stt++);
		this.avg = 2f * (l[0] + l[1]);
		for (int i = 2 ; i < 10 ; i ++) {
			avg += l[i];
		}
		this.avg /= 12f;
		this.avg = Math.round(avg * 10f) / 10f; 
		
        if (this.avg >= 9f) {
            this.hocluc =  "XUAT SAC";
        }
        else if (this.avg >= 8f) {
            this.hocluc = "GIOI";
        }
        else if (this.avg >= 7f) {
            this.hocluc = "KHA";
        }
        else if (this.avg >= 5f) {
            this.hocluc = "TB";
        }
        else this.hocluc = "YEU";
	}
	
	@Override
	public int compareTo(Diemhhh o) {
		if (this.avg.compareTo(o.avg) == 0) return this.ma.compareTo(o.ma);
		return o.avg.compareTo(this.avg);
	}
	
	@Override
	public String toString() {
        return ma + " " + ten + " " + String.format("%.1f", avg) + " " + hocluc;
	}
	
}
public class J05018_Diem {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t= Integer.parseInt(sc.nextLine());
		List<Diemhhh> list = new ArrayList<Diemhhh>();
		while (t-- > 0) {
			String ten = sc.nextLine();
			float[] l = new float[10];
			for (int i = 0 ; i < 10 ; i ++) {
				l[i] = sc.nextFloat();
			}
			
			Diemhhh a = new Diemhhh(ten,l);
			list.add(a);

		}
		
		Collections.sort(list);
		for (Diemhhh i : list) {
			System.out.println(i);
		}
	}
}



//3
//Luu Thuy Nhi
//9.3  9.0  7.1  6.5  6.2  6.0  8.2  6.7  4.8  5.5
//Le Van Tam
//8.0  8.0  5.5  9.0  6.8  9.0  7.2  8.3  7.2  6.8
//Nguyen Thai Binh
//9.0  6.4  6.0  7.5  6.7  5.5  5.0  6.0  6.0  6.0

