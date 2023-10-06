import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;

public class J08024_So_0_Va_9 {
	public static int check(String s, int n) {
		int t = 0;
		for (int i = 0 ; i < s.length() ; i++) {
			t = (t * 10 + (s.charAt(i) - '0'));
		}
		return t%n;
	}
	
	public static String solve (int n) {
		Queue<String> qe = new LinkedList<>();
		qe.add("9");
		while (true) {
			String tmp = qe.poll();
			if (check(tmp,n) == 0) {
				return tmp;
			}
			qe.add(tmp + "0");
			qe.add(tmp + "9");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			System.out.println(solve(n));
		}
	}
}
