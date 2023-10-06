import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.text.ParseException;


class SV implements Comparable<SV>{
	private String ma,ten,ns,lop;
	private float GPA;
	public static int num = 1;
	
	public SV(String ten, String lop, String ns,float gPA) {
		this.ma = String.format("B20DCCN%03d",num++);
		String lis[] = ten.split("\\s+");
		this.ten = formatName(ten);
		this.lop = lop;
		this.ns = ns;
		GPA = gPA;
	}
    private String formatName(String s) {
        String[] str = s.trim().split("\\s+");
        String res = "";
        for (String i : str) {
            res += i.substring(0, 1).toUpperCase() + i.substring(1).toLowerCase() + " ";
        }
        return res.substring(0, res.length() - 1);
    }
	
//    private String formatDate(String s) {
//        String[] str = s.split("/");
//        String res = "";
//        for (String i : str) {
//            if (i.length() == 1) {
//                i = "0" + i;
//            }
//            res += i + "/";
//        }
//        return res.substring(0, res.length() - 1);
//    }
	
	public Float getGPA() {
		return GPA;
	}

	public void setGPA(float gPA) {
		GPA = gPA;
	}

    @Override
    public int compareTo(SV other) {
        return -(this.getGPA().compareTo(other.getGPA()));
    }
	
	
	@Override
	public String toString() {
		return ma + " " + ten +" " + lop + " " + ns + " " + String.format("%.2f",GPA);
	}


	
}
public class J05003_DS_SV {
	public static void main(String[] args) throws ParseException{
		Scanner sc = new Scanner (System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		int t = Integer.parseInt(sc.nextLine());
		while (t-- > 0) {
			String s = sc.nextLine();
			String lop = sc.nextLine();
            String dateOfBirth = sdf.format(sdf.parse(sc.nextLine()));
            float gpa = Float.parseFloat(sc.nextLine());
			SV a = new SV(s,lop,dateOfBirth,gpa);
			System.out.println(a);
		}

	}
}
