import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class J03023_La_Ma {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Map<Character,Integer>mp = new HashMap<Character,Integer>();
		mp.put('I',1);mp.put('V',5);mp.put('X',10);mp.put('L',50);mp.put('C',100);mp.put('D',500);mp.put('M',1000);
		
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			int l = s.length();
			int tmp = mp.get(s.charAt(l-1));
			for (int i = l-2 ; i >= 0 ; i--) {
				if (mp.get(s.charAt(i)) >= mp.get(s.charAt(i+1))) {
					tmp += mp.get(s.charAt(i));
				}
				else tmp -= mp.get(s.charAt(i));
			}
			
			System.out.println(tmp);
		}
	
	}
}
