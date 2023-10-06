import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class JKT013_So_Loc_Phat{
	
	public static List<Integer> solve(int n , List<Integer> a){
		Queue<Integer> st = new LinkedList<Integer>();
		st.add(6);
		st.add(8);
		while (true) {
			int x = st.poll();
			String tmp = Integer.toString(x);
			if (tmp.length() <= n) a.add(x);
			st.add(x * 10 + 6);
			st.add(x * 10 + 8);
			if (tmp.length() > n) return a;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			List<Integer> a = new ArrayList<Integer>();
			solve(n,a);
			System.out.println(a.size());
			for (int i = a.size()-1 ; i >= 0 ; i--)System.out.print(a.get(i) + " ");
			System.out.println();
		}
	}
}
