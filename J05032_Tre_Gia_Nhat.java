import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class KhaiSinh implements Comparable<KhaiSinh>{
	private String ten;
	private Date ns;

	public KhaiSinh(String ten, Date ns) {
		super();
		this.ten = ten;
		this.ns = ns;
	}
	public String fomatDate() {
		SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
		return date.format(this.ns);
	}
	
	@Override
	public String toString() {
		return ten ;
		}

	@Override
	public int compareTo(KhaiSinh o) {
		// TODO Auto-generated method stub
		return o.ns.compareTo(this.ns);
	}
	
}
public class J05032_Tre_Gia_Nhat {
	public static void main(String[] args) throws ParseException{
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
		int t = Integer.parseInt(sc.nextLine());
		List<KhaiSinh> lis = new ArrayList<KhaiSinh>();
		for (int i = 0 ; i < t ; i++) {
			String ten = sc.next();
			Date tmp = date.parse(sc.nextLine());
			lis.add(new KhaiSinh(ten,tmp));
		}
		
		Collections.sort(lis);
		System.out.println(lis.get(0));
		System.out.println(lis.get(t-1));
	}
}
//5
//Nam 01/10/1991
//An 30/12/1990
//Binh 15/08/1993
//Tam 18/09/1990
//Truong 20/09/1990
