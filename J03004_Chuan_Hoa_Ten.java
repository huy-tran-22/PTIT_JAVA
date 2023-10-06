import java.util.Scanner;

public class J03004_Chuan_Hoa_Ten {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = Integer.parseInt(sc.nextLine());
		while (t-- > 0) {
			String s = sc.nextLine().trim();
			String[] lis = s.split("\\s+");
			for (int i = 0 ; i < lis.length ; i++) {
				lis[i] = lis[i].substring(0,1).toUpperCase() + lis[i].substring(1,lis[i].length()).toLowerCase();
			}
			System.out.println(String.join(" ",lis));
		}
	}
}
