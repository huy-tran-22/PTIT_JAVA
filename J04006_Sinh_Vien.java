import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

class sv1 {
	private String ma,ten,lop,ns;
	private float gpa;
	public sv1(String ten, String lop, String ns, float gpa) {
		super();
		this.ma = "B20DCCN001";
		this.ten = ten;
		this.lop = lop;
		this.ns = ns;
		this.gpa = gpa;
	}
	@Override
	public String toString() {
		return String.format("%s %s %s %s %.2f",ma,ten,lop,ns,gpa);
	}
	
}
public class J04006_Sinh_Vien {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner (System.in);
		SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
		
		String ten = sc.nextLine();
		String lop = sc.nextLine();
		String ns = date.format(date.parse(sc.next()));
		float gpa = sc.nextFloat();
		
		System.out.println(new sv1(ten,lop,ns,gpa));
	}
}
//Nguyen Hoa Binh
//D20CQCN04-B
//2/2/2002
//2
