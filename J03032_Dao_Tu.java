import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class J03032_Dao_Tu {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = Integer.parseInt(sc.nextLine());
		while (t-- > 0) {
			String s = sc.nextLine();
			String[] lis = s.split("\\s+");
			for (String i : lis) {
				i = new StringBuilder(i).reverse().toString();
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
	}
}
