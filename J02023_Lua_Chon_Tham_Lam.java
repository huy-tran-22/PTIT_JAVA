import java.util.Scanner;
import java.util.Stack;

public class J02023_Lua_Chon_Tham_Lam {
	
	public static int max(int n, int s) {
		if (n * 9 < s || s == 0) return -1;
		int cnt = 1;
		int res = 0;
		while (s >= 9) {
			res = res*10 + 9;
			s -= 9;
			cnt ++;
		}
		if (s > 0) {
			res = res * 10 + s;
			cnt ++;
		}
		while (cnt < n) {
			res *= 10;
		}
		return res;
	}
	
	public static void min(int n, int s) {
		if (n * 9 < s || s == 0) {
			System.out.print("-1");
			return;
		}
		Stack<Integer> st = new Stack<>();
		s -= 1;
		while (s >= 9) {
			s -= 9;
			st.push(9);
		}
		if ( s > 0) st.push(s);
		while (st.size() < s) st.push(0);
		int tmp = st.peek();
		st.pop();
		tmp += 1;
		st.push(tmp);
		while (!st.empty()) {
			System.out.print(st.peek());
			st.pop();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int s = sc.nextInt();
		min(n,s);
		System.out.println(" " + max(n,s));
	}
}
