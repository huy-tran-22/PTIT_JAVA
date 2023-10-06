
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class NV implements Comparable<NV>{
	private String ma,ten,gt,dc,mst;
	private Date ns,hopdong;
	public static int stt = 1;
	
	public NV(String ten, String gt, Date ns, String dc, String mst, Date hopdong) {
		this.ma = String.format("%05d",stt++);
		this.ten = ten;
		this.gt = gt;
		this.ns = ns;
		this.dc = dc;
		this.mst = mst;
		this.hopdong = hopdong;
	}

	public String formatDate(Date a) {
		SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
		return date.format(a);
	}
	
	@Override
	public String toString() {
		return ma + " " + ten + " " + gt + " " + formatDate(ns) + " " + dc + " " + mst + " " + formatDate(hopdong);
	}
	
	@Override
	public int compareTo(NV o) {
		return this.ns.compareTo(o.ns);
	}
}

public class J05007_DS_NV {
	public static void main(String[] args) throws ParseException{
		Scanner sc = new Scanner (System.in);
		SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
		int t = Integer.parseInt(sc.nextLine());
		ArrayList <NV> lis = new ArrayList<>();
		
		for (int i = 0 ; i < t ; i++) {
			String ten = sc.nextLine();
			String gt = sc.nextLine();
			Date ns = date.parse(sc.nextLine());
			String dc = sc.nextLine();
			String mst = sc.nextLine();
			Date hopdong = date.parse(sc.nextLine());
			
			NV tmp = new NV(ten, gt, ns, dc, mst, hopdong);
			lis.add(tmp);
		}
		Collections.sort(lis);
		for (NV i : lis) {
			System.out.println(i);
		}
	}
}


//Nguyen Van A
//Nam
//22/10/1982
//Mo Lao-Ha Dong-Ha Noi
//8333012345
//31/12/2013
//Ly Thi B
//Nu
//15/10/1988
//Mo Lao-Ha Dong-Ha Noi
//8333012346
//22/08/2011
//Hoang Thi C
//Nu
//04/02/1981
//Mo Lao-Ha Dong-Ha Noi
//8333012347
//22/08/2011
