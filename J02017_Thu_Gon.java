import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class J02017_Thu_Gon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		List <Integer> a = new ArrayList<>(t); 
		for (int i = 0 ; i < t ; i ++) a.add(sc.nextInt());
		while (true) {
			int check = 1;
			for (int i = 0 ; i < a.size()-1 ; i++) {
				if ((a.get(i) + a.get(i+1)) % 2 == 0 ) {
					a.remove(i+1);
					a.remove(i);
					i--;
					check = 0;
				}
			}
			if (check == 1) {
				System.out.println(a.size());
				return;
			}
		}
	}
}
