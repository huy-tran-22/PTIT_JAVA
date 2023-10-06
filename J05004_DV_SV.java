import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class SV {
	private String ma,ten,ns,lop;
	private float GPA;
	public static int num = 1;
	
	public SV(String ten, String lop, String ns,float gPA) {
		this.ma = String.format("B20DCCN%03d",num++);
		String lis[] = ten.split("\\s+");
		String tmp = "";
		for (int i = 0 ; i < lis.length ; i++) {
			tmp = tmp + lis[i].substring(0,1).toUpperCase() + lis[i].substring(1,lis[i].length()).toLowerCase();
			if (i != lis.length - 1) tmp += " ";
		}	
		this.ten = tmp;
		this.lop = lop;
		this.ns = ns;
		GPA = gPA;
	}

	@Override
	public String toString() {
		return ma + " " + ten +" " + lop + " " + ns + " " + String.format("%.2f",GPA);
	}
	
	
}

public class J05004_DV_SV {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner (System.in);
		SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
		List<SV> lis = new ArrayList<>();
		int t = Integer.parseInt(sc.nextLine());
		while (t-- > 0) {
			String ten = sc.nextLine().trim();
			String lop = sc.nextLine();
			String ns = date.format(date.parse(sc.nextLine()));
			float gpa = Float.parseFloat(sc.nextLine());
			SV tmp = new SV (ten,lop,ns,gpa);
			lis.add(tmp);
		}
		for (SV i : lis) {
			System.out.println(i);
		}
	}
}
