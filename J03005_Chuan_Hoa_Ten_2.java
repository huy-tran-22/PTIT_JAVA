import java.util.Scanner;

public class J03005_Chuan_Hoa_Ten_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = Integer.parseInt(sc.nextLine());
		while (t-- > 0) {
			 String s = sc.nextLine().trim();
			 String lis[] = s.split("\\s+");
			 for (int i = 0 ; i < lis.length ; i++) {
				 lis[i] = lis[i].substring(0,1).toUpperCase() + lis[i].substring(1).toLowerCase();
			 }
			 for (int i = 1 ; i < lis.length ; i++) {
				 System.out.printf("%s",lis[i]);
				 if (i == lis.length - 1)System.out.print(", ");
				 else System.out.print(" ");
			 }
			 lis[0] = lis[0].toUpperCase();
			 System.out.printf("%s",lis[0]);
			 System.out.println();
		}
	}
}
