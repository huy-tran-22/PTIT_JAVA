import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


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

public class J05005_DS_SV {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner (System.in);
		SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
		int t = sc.nextInt();
		List<SV> lis = new ArrayList<>(t);

		for (int i = 1 ; i <= t ; i++) {
			sc.nextLine();
			String ten = sc.nextLine();
			String lop = sc.nextLine();
			String ns = date.format(date.parse(sc.nextLine()));
			float gpa = sc.nextFloat();
			SV tmp = new SV (ten,lop,ns,gpa);
			lis.add(tmp);
		}
		Collections.sort(lis);
		for (SV i : lis) {
			System.out.println(i);
		}
	}
}



